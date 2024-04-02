import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        if ( buscarProductos(producto.getNombre()).size()==0 && !(producto.getCategoria().getNombre().equals("vacio"))) {
            registroProducto.add(producto);
            

        }else{
            System.out.println("Registro invalido");
        }

    }

    public Producto crearProducto() {
        String nombre;

        System.out.println("Ingrese el nombre del producto");
        nombre = scn.nextLine();

        System.out.println("Ingrese el precio del producto");
        double precio = scn.nextDouble();
        int stock;

        do {

            System.out.println("Ingrese el stock del producto");
            stock = scn.nextInt();
            if (stock <= 0) {
                System.out.println("Error.EL stock tiene que ser positivo");

            }

        } while (stock <= 0);

        Categoria categoria = new Categoria();
        System.out.println(
                "Menu creación de producto:\n Presione 1) Crear producto con categoria registrada\n Presione 2) Crear producto creando una nueva categoria");

        int opcion = scn.nextInt();

        switch (opcion) {

            case 1:

                String filtroCategoria;
                listarCategorias();
                scn.nextLine();
                System.out.println("Con que categoria desea crear el producto");
                filtroCategoria = scn.nextLine();
                if (buscarCategoria(filtroCategoria).size()==1) {
                    categoria = buscarCategoria(filtroCategoria).get(0);                   
                }else{
                    categoria.setNombre("vacio");
               
                }

                break;

            case 2:
                categoria = crearCategoria();
                registrarCategoria(categoria);
                break;

            default:
                System.out.println("Dato no valido");
                break;
        }
        return new Producto(nombre, categoria, precio, stock);

    }

    public Categoria crearCategoria() {
        String nombre;
        scn.nextLine();
        System.out.println("Ingrese el nombre de la categoria");
        nombre = scn.nextLine();
        System.out.println("Ingrese la descripcion de la categoria de la categoria");
        String descripcion = scn.nextLine();
        return new Categoria(nombre, descripcion);
    }

    public void registrarCategoria(Categoria categoria) {
        if (buscarCategoria(categoria.getNombre()).size() == 0) {

            registoCategoria.add(categoria);
        }
    }

    public ArrayList<Categoria> buscarCategoria (String filtro){
        
        ArrayList<Categoria>lista=new ArrayList<>();
        for (Categoria categorias  : registoCategoria) {
            if (categorias.getNombre().toLowerCase().equals(filtro.toLowerCase())) {
             lista.add(categorias);   
            }
            
        }
        return lista;
    }

    public ArrayList<Producto> buscarProductos(String filtro) {
        ArrayList<Producto> productoFiltro = new ArrayList<>();
        for (Producto productos : registroProducto) {
            if (productos.getCategoria().getNombre().toLowerCase().equals(filtro.toLowerCase()) || productos.getNombre().toLowerCase().equals(filtro.toLowerCase())
                    || String.valueOf(productos.getPrecio()).equals(filtro)) {
                productoFiltro.add(productos);

            }
        }
        return productoFiltro;

    }

    public void listarProductos(ArrayList<Producto> lista) {
        if (lista.size() > 0) {
            for (Producto productos : lista) {
                System.out.println(productos);
            }

        } else {
            System.out.println("No se encontraron los productos");
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
        String nombre;
        String telefono;
        String direccion;

        System.out.println("Ingrese el nombre del proveedor");
        nombre = scn.nextLine();
        System.out.println("Ingrese el telefono del proveedor");
        telefono = scn.nextLine();
        System.out.println("Ingrese la direccion del proveedor");
        direccion = scn.nextLine();

        return new Proveedor(nombre, telefono, direccion);
    }

    public void registrarProveedor(Proveedor proveedor) {
        if (buscarProveedor(proveedor.getNombre()).size() == 0
                && buscarProveedor(proveedor.getTelefono()).size() == 0) {

            registoProveedor.add(proveedor);
        } else {
            System.out.println("Registro invalido");
        }
    }

    private ArrayList<Proveedor> buscarProveedor(String filtro) {
        ArrayList<Proveedor> lista = new ArrayList<>();
        for (Proveedor proveedores : registoProveedor) {
            if (proveedores.getNombre().equals(filtro) || proveedores.getTelefono().equals(filtro)) {
                lista.add(proveedores);
            }

        }
        return lista;
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
        listarProductos(registroProducto);
        String nombreProducto;
        int cantidad = 0;
        int dia = 0;
        int mes = 0;
        int año = 0;
        Producto producto = new Producto("vacio", null, 0, 0);
        scn.nextLine();
        System.out.println("Ingrese el nombre del producto");
        nombreProducto = scn.nextLine();
        if (buscarProductos(nombreProducto).size() > 0) {
            producto = buscarProductos(nombreProducto).get(0);
        }
        do {
            System.out.println("¿Cúantos productos de " + nombreProducto + " desea llevar?");
            cantidad = scn.nextInt();
            if (cantidad <= 0) {
                System.out.println("Error.La cantidad tiene que ser positiva");

            }
        } while (cantidad <= 0);

        System.out.println("ingrese la fecha de la venta");
        scn.nextLine();
        System.out.println("Ingrese el año de la venta");
        año = scn.nextInt();
        System.out.println("Ingrese el mes de la venta");
        mes = scn.nextInt();
        System.out.println("Ingrese el año de la venta");
        dia = scn.nextInt();

        return new Venta(producto, cantidad, new Date(año-1900, mes - 1, dia));
    }

    public void registarVenta(Venta venta) {
        if (!venta.getProducto().getNombre().equals("vacio") && venta.getProducto().getStock() >= venta.getCantidad()) {

            registoVenta.add(venta);
            venta.getProducto().setStock(venta.getProducto().getStock() - venta.getCantidad());
            if (venta.getProducto().getStock() == 0) {
                registroProducto.remove(venta.getProducto());
            }

        } else {
            System.out.println("Registro invalido");
        }

    }

    public void leerProductosTxt() {
        try (BufferedReader reader = new BufferedReader(new FileReader("lista_productos.txt"))) {
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                String[] bloques = linea.split(",");
                if (bloques.length == 5) {
                    String nombre = bloques[0];
                    String nombre_categoria = bloques[1];
                    String descripcion_categoria = bloques[2];
                    Categoria categoria = new Categoria(nombre_categoria, descripcion_categoria);
                    double precio = Double.parseDouble(bloques[3]);
                    int stock = Integer.parseInt(bloques[4]);
                    registrarProducto(new Producto(nombre, categoria, precio, stock));
                    registrarCategoria(categoria);
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void leerProveedores() {
        try (BufferedReader reader = new BufferedReader(new FileReader("lista_proveedores.txt"))) {
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                String[] bloques = linea.split(",");
                if (bloques.length == 3) {
                    String nombre = bloques[0];
                    String telefono = bloques[1];
                    String direccion = bloques[2];
                    registrarProveedor(new Proveedor(nombre, telefono, direccion));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void listarVenta() {
        if (registoVenta.size()>0) {
            
            for (Venta ventas : registoVenta) {
                System.out.println(ventas);
                
            }
        }else{
            System.out.println("No hay ventas registradas");
        }
        scn.nextLine();
    }

}