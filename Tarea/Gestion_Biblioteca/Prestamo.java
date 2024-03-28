// ibro (Libro): Libro prestado.
// usuario (Usuario): Usuario que ha prestado el libro.
// fechaPrestamo (Fecha): Fecha en la que se realizó el préstamo.
// fechaDevolucion (Fecha): Fecha en la que se debe devolver el libro

import java.util.Date;
import java.util.Scanner;

public class Prestamo {
    private Libro libro;
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo() {
    }

    public Prestamo(Libro libro, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean fechaVencida() {
        Date fechaActual = Utils.crearFecha("Ingrese la fecha actual");
        return fechaActual.compareTo(this.fechaDevolucion) > 0;
    }

    @Override
    public String toString() {
        return "Prestamo [libro=" + libro.toString() + ", usuario=" + usuario.toString() + ", fechaPrestamo: Año="
                + fechaPrestamo.getYear() + ",Mes=" + fechaPrestamo.getMonth() + ",1Día="+fechaPrestamo.getDay()
                + ", fechaDevolucion:Año="+fechaDevolucion.getYear() +",Mes="+fechaDevolucion.getMonth() +",Día="+fechaDevolucion.getDay()+"+]";
    }

}
