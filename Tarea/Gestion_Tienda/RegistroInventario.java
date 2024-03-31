import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroInventario {

    ArrayList<Producto> registroProducto = new ArrayList<>();
    ArrayList<Categoria> registoCategoria = new ArrayList<>();
    ArrayList<Proveedor> registoProveedor = new ArrayList<>();
    ArrayList<Venta> registoVenta = new ArrayList<>();
    Scanner scn = new Scanner(System.in);

    public void registrarProducto(Producto producto) {
        registroProducto.add(producto);

    }

    public Producto crearProducto() {
        String nombre;
        do {

            System.out.println("Ingrese el nombre del producto");
            nombre = scn.nextLine();
            if (buscarProductos(nombre).size() > 0) {
                System.out.println("El producto " + buscarProductos(nombre).get(0) + " ya existe ");

            }

        } while (buscarProductos(nombre).size() > 0);

        System.out.println("Ingrese el precio del producto");
        double precio = scn.nextDouble();
        System.out.println("Ingrese el stock del producto");
        int stock = scn.nextInt();
        Categoria categoria = new Categoria();

        System.out.println(
                "Menu creación de producto:\n Presione 1) Crear producto con categoria registrada\n Presione 2) Crear producto creando una nueva categoria");
        int opcion = scn.nextInt();

        switch (opcion) {
            case 1:
                String filtroCategoria;
                do {
                    listarCategorias();
                    System.out.println("Con que categoria desea crear el producto");
                    filtroCategoria = scn.nextLine();
                } while (buscarProductos(filtroCategoria).size() == 0);
                categoria = buscarProductos(filtroCategoria).get(0).getCategoria();
                break;

            case 2:
                categoria = crearCategoria();
                break;

            default:
                System.out.println("Dato no valido");
                break;
        }
        return new Producto(nombre, categoria, precio, stock);

    }

    public Categoria crearCategoria() {
        String nombre;
        do {
            scn.nextLine();
            System.out.println("Ingrese el nombre de la categoria");
            nombre = scn.nextLine();
            if (buscarProductos(nombre).size() > 0) {
                System.out.println("La categoria " + buscarProductos(nombre).get(0) + " ya existe ");

            }
        } while (buscarProductos(nombre).size() > 0);
        System.out.println("Ingrese la descripcion de la categoria de la categoria");
        String descripcion = scn.nextLine();
        return new Categoria(nombre, descripcion);
    }

    public void registrarCategoria(Categoria categoria) {
        registoCategoria.add(categoria);
    }

    public ArrayList<Producto> buscarProductos(String filtro) {
        ArrayList<Producto> productoFiltro = new ArrayList<>();
        for (Producto productos : registroProducto) {
            if (productos.getCategoria().getNombre().equals(filtro) || productos.getNombre().equals(filtro)
                    || String.valueOf(productos.getPrecio()).equals(filtro)) {
                productoFiltro.add(productos);

            }
        }
        return productoFiltro;

    }

    public void listarProductos() {
        if (registroProducto.size() > 0) {
            for (Producto productos : registroProducto) {
                System.out.println(productos);
            }

        } else {
            System.out.println("No hay productos registrados");
        }
    }

    public void listarCategorias() {
        if (registroProducto.size() > 0) {
            for (Categoria categorias : registoCategoria) {
                System.out.println(categorias);
            }

        } else {
            System.out.println("No hay categorias registradas");
        }
    }

    public Proveedor creaProveedor() {
        boolean existeProveedor = false;
        String nombre;
        String telefono;
        String direccion;
        do {

            System.out.println("Ingrese el nombre del proveedor");
            nombre = scn.nextLine();
            System.out.println("Ingrese el telefono del proveedor");
            telefono = scn.nextLine();
            System.out.println("Ingrese la direccion del proveedor");
            direccion = scn.nextLine();
            for (Proveedor proveedor : registoProveedor) {
                if (proveedor.getNombre().equals(nombre) && proveedor.getDireccion().equals(direccion)
                        && proveedor.getTelefono().equals(direccion)) {
                    existeProveedor = true;

                }
            }
            if (existeProveedor) {
                System.out.println("ESte proveedor ya existe,Vuelva a intentarlo");
            }
        } while (!existeProveedor);

        return new Proveedor(nombre, telefono, direccion);
    }

    public void registrarProveedor(Proveedor proveedor) {
        registoProveedor.add(proveedor);
    }

    public void listarProveedor() {
        if (registroProducto.size() > 0) {
            for (Proveedor proveedor : registoProveedor) {
                System.out.println(proveedor);
            }

        } else {
            System.out.println("No hay proveedores registrados");
        }
    }

    public Venta crearVenta() {
        listarProductos();
        String nombreProducto;
        int cantidad = 0;
        int dia = 0;
        int mes = 0;
        int año = 0;
        Producto producto = new Producto();

        if (registroProducto.size() > 0) {
            do {

                System.out.println("Ingrese el nombre del producto");
                nombreProducto = scn.nextLine();
                if (buscarProductos(nombreProducto).size() > 0) {
                    producto = buscarProductos(nombreProducto).get(0);
                } else {
                    System.out.println("Este producto no esta dispomible vuelva a intentarlo");
                }
            } while (buscarProductos(nombreProducto).size() == 0);
            do {
                System.out.println("¿Cúantos pructos de " + nombreProducto + " desea llevar?");
                cantidad = scn.nextInt();
                if (producto.getStock() > cantidad) {
                    System.out.println("Solo hay "+producto.getStock()+" productos de "+producto.getNombre());

                }
            } while (producto.getStock() < cantidad);
            System.out.println("ingrese la fecha de la venta");
            scn.nextLine();
            System.out.println("Ingrese el año de la venta");
            año = scn.nextInt();
            System.out.println("Ingrese el mes de la venta");
            mes = scn.nextInt();
            System.out.println("Ingrese el año de la venta");
            dia = scn.nextInt();

        } else {
            System.out.println("No hay ningun producto en la tienda");
        }
        return new Venta(producto, cantidad, new Date(año, mes - 1, dia));
    }

    public void registarVenta(Venta venta) {
        if (venta.getCantidad() > 0) {
            registoVenta.add(venta);
            venta.getProducto().setStock(venta.getProducto().getStock() - venta.getCantidad());
            if (venta.getProducto().getStock()==0) {
                registroProducto.remove(venta.getProducto());
                
            }

        }
    }

}