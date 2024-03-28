//     registrarLibro(Libro libro): Agrega un libro al registro. Este método debe realizar las mismas validaciones que el
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
// f. listarAutores(): Imprime en la consola la información de todos los autores registrados.
// g. listarPrestamos(): Imprime en la consola la información de todos los préstamos activos.
// h. buscarLibros(String cedula): Busca y retorna una lista de libros que coincidan con el filtro especificado. El filtro
// puede ser una cadena que se compara con el título, el autor, el ISBN o la categoría del libro

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class RegistroBiblioteca {
    ArrayList<Libro> registroLibros = new ArrayList<>();
    ArrayList<Autor> registroAutores = new ArrayList<>();
    ArrayList<Prestamo> prestamosUsuario = new ArrayList<>();
    ArrayList<Prestamo> registroDevoluciones = new ArrayList<>();

    Scanner scn = new Scanner(System.in);

    public void registrarAutor(Autor autor) {

        registroAutores.add(autor);
    }

    public void registrarLibros(Libro libro) {
        boolean existeLibro = false;
        for (Libro libros : registroLibros) {
            if (libro.getIsbn().equals(libros.getIsbn())) {
                existeLibro = true;
                System.out.println("Registro invalido.Este libro ya existe");
                break;
            }
        }
        if (!existeLibro) {
            registroLibros.add(libro);
            System.out.println("Registro completado");
        }
    }

    public void registarPrestamo(Prestamo prestamo) {
        if (prestamo.getLibro().hayEjemplares()) {
            boolean fechaVencida = false;
            for (Prestamo prestamos : prestamosUsuario) {
                if (prestamo.getUsuario().getCedula().equals(prestamos.getUsuario().getCedula())) {
                    if (prestamo.fechaVencida()) {
                        fechaVencida = true;
                    }
                }
            }
            if (fechaVencida) {
                System.out.println("No se pudo registrar el prestamo.El usuario " + prestamo.getUsuario().getNombre()
                        + " tiene fechas vencidas");
            } else {
                prestamosUsuario.add(prestamo);
                if (prestamo.getLibro().getEjemplares() > 0) {

                    prestamo.getLibro().setEjemplares(prestamo.getLibro().getEjemplares() - 1);

                    System.out.println("Registro completado");
                } else {
                    System.out.println("No hay ejemplares disponibles del libro " + prestamo.getLibro().getTitulo());

                }
            }

        } else {
            System.out.println(
                    "No se pudo registrar el prestamo.No hay ejemplares del libro " + prestamo.getLibro().getTitulo());
        }

    }

    public void registrarDevolucion(Prestamo prestamo) {
        registroDevoluciones.add(prestamo);
        prestamo.getLibro().setEjemplares(prestamo.getLibro().getEjemplares() + 1);
        prestamosUsuario.remove(prestamo);

    }

    public void listarAutores() {
        if (registroAutores.size() > 0) {

            for (Autor autores : registroAutores) {
                System.out.println(autores);

            }
        } else {
            System.out.println("No hay autores registrados ");
        }
    }

    public void listarLibros() {
        if (registroLibros.size() > 0) {

            for (Libro libros : registroLibros) {
                System.out.println(libros);
            }
        } else {
            System.out.println("No hay libros registrados");
        }
    }

    public void listarPrestamos(ArrayList<Prestamo> lista, String mensaje) {
        if (lista.size() > 0) {

            for (Prestamo prestamos : lista) {
                System.out.println(prestamos);

            }

        } else {
            System.out.println(mensaje);
        }
    }

    public ArrayList<Libro> buscarLibros(String filtro) {
        ArrayList<Libro> lisbrosBuscados = new ArrayList<>();

        for (Libro busqueda : registroLibros) {
            if (busqueda.getTitulo().equals(filtro) || busqueda.getIsbn().equals(filtro)
                    || busqueda.getCategoria().equals(filtro) || busqueda.getAutor().getNombre().equals(filtro)) {
                lisbrosBuscados.add(busqueda);
            }

        }
        return lisbrosBuscados;
    }

    public Autor crearAutor() {
        String nombre;
        String nacionalidad;
        System.out.println("Ingrese el nombre del autor");
        nombre = scn.nextLine();
        System.out.println("ingrese la nacionalidad del autor");
        nacionalidad = scn.nextLine();
        return new Autor(nombre, nacionalidad);

    }

    public Libro crearLibro() {
        String titulo;
        String isbn;
        String categoria;
        int ejemplares;
        System.out.println("Ingrese el nombre del libro");
        titulo = scn.nextLine();

        System.out.println("Ingrese el ISBN del libro");
        isbn = scn.nextLine();

        System.out.println("Ingrese la categoria  del libro");
        categoria = scn.nextLine();

        System.out.println("Ingrese cuantos ejemplares va a registar del libro");
        ejemplares = scn.nextInt();

        System.out.println("Tenga en cuenta que para registrar un libro neceseita registrar un autor");
        scn.nextLine();
        return new Libro(titulo, isbn, ejemplares, crearAutor(), categoria);

    }

    public Prestamo crearPrestamo() {

        String isbn;
        listarLibros();
       
        System.out.println("¿Cúal de estos libros desea alquilar?.Escriba el ISBN del libo");
        isbn = scn.nextLine();
       
        return new Prestamo(buscarLibros(isbn).get(0), crearUsuario(), Utils.crearFecha("Ingrese fecha de prestamo"),
                Utils.crearFecha("Ingrese fecha de devolución"));// validar que existe el libro

    }

    public Usuario crearUsuario() {
        String nombre;
        String cedula;
        System.out.println("Nombre del usuario:");
        nombre = scn.nextLine();
        System.out.println("Cedula del usuario:");
        cedula = scn.nextLine();
        return new Usuario(nombre, cedula);
    }

    public Prestamo crearDevolucion() {
        ArrayList<Prestamo> prestamosUsuario = new ArrayList<>();
        System.out.println("Ingrese la cedula del usuario");
        String cedula = scn.nextLine();
        for (Prestamo prestamos : prestamosUsuario) {
            if (prestamos.getUsuario().getCedula().equals(cedula)) {
                prestamosUsuario.add(prestamos);
            }
        }

        System.out.println("Estos son los prestamos del usuario identificado con la cedula " + cedula);
        listarPrestamos(prestamosUsuario, "El usuario no tiene prestamos registrados");
        System.out.println("¿Cúal libro desean devolver?.Escriban el ISBN del libro");
        String isbn=scn.nextLine();
        boolean existePrestamo=false;
        Prestamo prestamo=new Prestamo();

        for (Prestamo prestamos : prestamosUsuario) {
            if (prestamos.getLibro().getIsbn().equals(isbn)) {
                existePrestamo=true;
                prestamo=prestamos;
                break;
                
            }
        }
        return prestamo;
        
    }

}
