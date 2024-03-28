import java.util.Scanner;
// a. registrarLibro(Libro libro): Agrega un libro al registro. Este método debe realizar las mismas validaciones que el
// ejercicio anterior.
// b. registrarAutor(Autor autor): Agrega un autor al registro.
// c. registrarPrestamo(Prestamo prestamo): Registra un préstamo de un libro a un usuario. Este método debe realizar
// las siguientes validaciones:
// El libro debe tener ejemplares disponibles.
// El usuario no debe tener préstamos vencidos.
// d. registrarDevolucion(Prestamo prestamo): Registra la devolución de un libro.
// Yaneth Mejía Rendón
// PROGRAMACIÓN II
// Universidad de Caldas - I SEM 2024
// e. listarLibros(): Imprime en la consola la información de todos los libros registrados.
// f. listarAutores(): Imprime en la consola la info scn =rmación de todos los autores registrados.
// g. listarPrestamos(): Imprime en la consola la información de todos los préstamos activos.
// h. buscarLibros(String filtro): Busca y retorna una lista de libros que coincidan con el filtro especificado. El filtro
// puede ser una cadena que se compara con el título, el autor, el ISBN o la categoría del libro

public class Main {
    static RegistroBiblioteca instancia_Registro = new RegistroBiblioteca();

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        boolean esSalir = false;

        System.out.println("Registro biblioteca");
        do {
            int opcion;
            System.out.println(
                    "Menú:\n Presione 1) Registrar libro \n Presione 2) Registrar autor \n Presione 3) Registrar prestamo \n Presione 4) Registrar devolución \n Presione 5) Listar libros \n Presione 6) Listar autores \n Presione 7) Listar prestamos \n Presione 8) Buscar un libro con un filtro en especifico(El filtro puede ser una cadena que se compara con el título, el autor, el ISBN o la categoría del libro) ");

            opcion = scn.nextInt();
            switch (opcion) {
                case 1:
                    instancia_Registro.registrarLibros(instancia_Registro.crearLibro());// falta crear la opcion de que
                                                                                        // ya meta un autor existente

                    break;
                case 2:
                    instancia_Registro.registrarAutor(instancia_Registro.crearAutor());

                    break;
                case 3:
                    instancia_Registro.registarPrestamo(instancia_Registro.crearPrestamo());

                    break;
                case 4:
                    instancia_Registro.registrarDevolucion(instancia_Registro.crearDevolucion());

                    break;
                case 5:
                    instancia_Registro.listarLibros();

                    break;
                case 6:
                    instancia_Registro.listarAutores();

                    break;
                case 7:
                    instancia_Registro.listarPrestamos(instancia_Registro.prestamosUsuario,
                            "NO hay prestamos registrados");

                    break;
                case 8:
                    scn.nextLine();
                    if (instancia_Registro.registroLibros.size()>0) {
                        
                    
                    System.out.println("Que busqueda desea realizar");
                    instancia_Registro.buscarLibros(scn.nextLine());
                    }else{
                        System.out.println("No hay libros registrados");
                    }

                    break;

                default:
                System.out.println("Dato no valido");
                    break;
            }

        } while (!esSalir);
    }

}