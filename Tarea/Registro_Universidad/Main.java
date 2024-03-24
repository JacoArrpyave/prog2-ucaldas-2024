package Registro_Universidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    static RegistroEstudiante instanciaRegistro = new RegistroEstudiante();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean esSalir = false;
        System.out.println("Registro de estudiantes ");
        do {

            int opcion;

            System.out.println(
                    "Menu: \n Presione 1) Agregar estudianetes \n Presione 2) Mostrar estudinates \n Presione 3) Eliminar estudiante  \n Presione 4) Buscar estudiantes con un filtro especifico \n Presione 5) Salir del programa  ");
            opcion = scn.nextInt();
            switch (opcion) {
                case 1:
                    String nombre = "";
                    String codigo = "";
                    String carrera = "";
                    double promedio;

                    System.out.println("Ingrese los datos del estudiante que va agregar.");
                    System.out.println("Nombre del estudiante");
                    scn.nextLine();
                    nombre = scn.nextLine();
                    System.out.println("Codigo del estudiante");
                    codigo = scn.nextLine();
                    System.out.println("Carrera del estudiante");
                    carrera = scn.nextLine();
                    System.out.println("Promedio del estudiante");
                    promedio = scn.nextDouble();
                    instanciaRegistro.agregarEstudiante(new Estudiante(nombre, codigo, carrera, promedio));

                    break;
                case 2:
                    if (instanciaRegistro.listaEstudiantes.size() > 0) {

                        instanciaRegistro.mostrarEstudiantes(instanciaRegistro.listaEstudiantes);
                    } else {
                        System.out.println("No hay ningun estudiante listado");
                    }
                    break;
                case 3:
                    String codigoEliminar = "";
                    scn.nextLine();
                    if (instanciaRegistro.listaEstudiantes.size() > 0) {
                        System.out.println("Ingrese el codigo del estudiante que desea eliminar");
                        codigoEliminar = scn.nextLine();
                        instanciaRegistro.eliminarEstudiante(codigoEliminar);
                        instanciaRegistro.mostrarEstudiantes(instanciaRegistro.listaEstudiantes);

                    } else {
                        System.out.println("No hay ningun estudiante listado");
                    }

                    break;
                case 4:
                    String filtro = "";
                    ArrayList<Estudiante> listaConFiltro;
                    scn.nextLine();
                    if (instanciaRegistro.listaEstudiantes.size() > 0) {
                        System.out.println(
                                "Ingrese el filtro para buscar los estudiantes en comun\n Nota:Puede ser un codigo,nombre o carrera en común ");
                        filtro = scn.nextLine();
                        listaConFiltro = instanciaRegistro.buscarEstudiantes(filtro);
                        instanciaRegistro.mostrarEstudiantes(listaConFiltro);

                    } else {
                        System.out.println("No hay ningun estudiante listado");
                    }

                    break;
                case 5:
                    esSalir = true;
                    break;

                default:
                    System.out.println("Dato no valido");
                    break;
            }
        } while (!esSalir);

    }
}