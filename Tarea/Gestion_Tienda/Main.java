// a. registrarProducto(Producto producto): Agrega un producto al registro. Este método debe realizar las mismas
// validaciones que el ejercicio anterior.
// b. registrarCategoria(Categoria categoria): Agrega una categoría al registro.
// c. registrarProveedor(Proveedor proveedor): Agrega un proveedor al registro.
// d. registrarVenta(Venta venta): Registra una venta de un producto. Este método debe realizar las siguientes
// validaciones:
// El producto debe tener stock disponible.
// a. listarProductos(): Imprime en la consola la información de todos los productos registrados.
// b. listarCategorias(): Imprime en la consola la información de todas las categorías registradas
// c. listarProveedores(): Imprime en la consola la información de todos los proveedores registrados.
// d. listarVentas(): Imprime en la consola la información de todas las ventas registradas.
// e. buscarProductos(String filtro): Busca y retorna una lista de productos que coincidan con el filtro especificado. El
// filtro puede ser una cadena que se compara con el nombre, la categoría o el precio del producto

import java.util.Scanner;

public class Main {
    static RegistroInventario instacia_Registro = new RegistroInventario();
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        instacia_Registro.leerProductosTxt();
    
        instacia_Registro.leerProveedores();
        
        System.out.println("Registro");
        boolean esSalir = false;
        int opcion;
        do {
            System.out.println(
                    "Menú\n Escoja 1) Registrar producto\n Escoja 2) Registrar categoria\n Escoja 3) Registrar proveedor\n Escoja 4) Registrar venta\n Escoja 5) Listar productos\n Escoja 6) Listar categorias\n Escoja 7) Listar proveedores\n Escoja 8) Listar ventas\n Escoja 9) Buscar un libro con filtro(El filtro puede ser una cadena que se compara con el nombre, la categoría o el precio del producto)");
            opcion = scn.nextInt();
            scn.nextLine();
            switch (opcion) {
                case 1:
                    instacia_Registro.registrarProducto(instacia_Registro.crearProducto());
                    break;
                case 2:
                    instacia_Registro.registrarCategoria(instacia_Registro.crearCategoria());
                    break;
                case 3:
                    instacia_Registro.registrarProveedor(instacia_Registro.creaProveedor());
                    break;
                case 4:
                    instacia_Registro.registarVenta(instacia_Registro.crearVenta());
                    break;
                case 5:
                    instacia_Registro.listarProductos(instacia_Registro.registroProducto);

                    break;
                case 6:
                    instacia_Registro.listarCategorias();

                    break;
                case 7:
                    instacia_Registro.listarProveedor();

                    break;
                case 8:
                    instacia_Registro.listarVenta();

                    break;
                case 9:
                    System.out.println("Cúal es el filtro");
                    String filtro = scn.nextLine();
                    instacia_Registro.listarProductos(instacia_Registro.buscarProductos(filtro));

                    break;

                default:
                System.out.println("Esta opcion es invalida5");
                    break;
            }


        } while (!esSalir);

    }

}