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
                    instanciaRegistro.agregarEstudiante(instanciaRegistro.crearEstudiante());

                    break;
                case 2:
                    instanciaRegistro.mostrarEstudiantes(instanciaRegistro.listaEstudiantes);

                    break;
                case 3:
                    String codigoEliminar = "";
                    
                    System.out.println("Ingrese el codigo del estudiante que desea eliminar");
                    codigoEliminar = scn.nextLine();
                    instanciaRegistro.eliminarEstudiante(codigoEliminar);
                    
                    
                    break;
                case 4:
                scn.nextLine();
                System.out.println("Ingrese el filtro para buscar");
                String filtro=scn.nextLine();
                   
                        instanciaRegistro.mostrarEstudiantes(instanciaRegistro.buscarEstudiantes(filtro));
                    

                    break;
                case 5:
                    esSalir = true;
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Dato no valido");
                    break;
            }
        } while (!esSalir);

    }
}