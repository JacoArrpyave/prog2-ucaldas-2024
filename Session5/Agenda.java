package Session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    ArrayList<Tarea> lista_tareas = new ArrayList<>();
    Scanner scn = new Scanner(System.in);

    public Agenda() {
    }

    public void inputDataUser(int veces) {

        for (int i = 0; i < veces; i++) {
            System.out.println("Ingrese el nombre de la tarea");

            String nombre_tarea = scn.nextLine();


            System.out.println("Ingrese la duracion (en minutos)");
            String duracion = scn.nextLine();
            

            System.out.println("Ingrese de quien es la terea");
            String propetario = scn.nextLine();
            boolean validez = false;
            String estado ;
            do {

                System.out.println(
                        "Ingrese el estado de la tarea \n NOTA:Escoja algunas de estas tres opciones \nA)activa \nB)desarrollo \nC)realizada");
                         estado = scn.nextLine();
                

                if ((estado.equals("activa") || estado.equals("desarrolo") || estado.equals("realizada"))) {
                    validez = true;
                    break;
                    

                }
                System.out.println("El valor no es valido\nVuelva a intentar");

            } while (!validez);

            lista_tareas.add(new Tarea(nombre_tarea, duracion, propetario,estado));
            System.out.println("*************");
        }

    }

    public void menu() {
        boolean finalizar = false;
        System.out.println("Lista de tareas");
        System.out.println("Agregue 5 elementos a su lista de tareas");
        inputDataUser(5);
        do {
            System.out.println(
                    "Menu:\nEscoja 1 para: Agregar una tarea\nEscoja 2 para: Elimininar una tarea\nEscoja 3 para: Ver todas las tareas\nEscoja 4 Para: Modificar su tarea\nEscoja 5 para: Salir del menu");
            int opcion_menu = scn.nextInt();
            System.out.println("*******************");
            switch (opcion_menu) {
                case 1:
                    System.out.println("¿Cúantas tareas quiere agregar?");
                    int veces_agregar = scn.nextInt();

                    inputDataUser(veces_agregar);
                    break;
                case 2:
                    for (Tarea tarea : lista_tareas) {
                        System.out.println(tarea.toString());

                    }
                    System.out.println("Cuantos elementos quiere eliminar");
                    int veces_eliminar = scn.nextInt();

                    if (lista_tareas.size() >= veces_eliminar) {

                        for (int i = 0; i < veces_eliminar; i++) {

                            System.out.println("Que posicion quiere eliminar");
                            lista_tareas.remove(scn.nextInt());

                        }
                        break;
                    }
                    System.out.println("Este dato no es valido");

                case 3:
                    for (Tarea tarea : lista_tareas) {

                        System.out.println(tarea.toString());
                    }
                    break;
                case 5:

                    finalizar = true;
                case 4:

                    System.out.println(
                            "Escriba 1 para:Cambiar el nombre de la tarea\nEscriba 2 para:Cambair la duracion de la tarea(en minutos)\nEscriba 3 para:Cambair el propietario\nEscriba 4 para:Cambiar el estado. ");
                    int opcion_cambios = scn.nextInt();

                    switch (opcion_cambios) {
                        case 1:
                            boolean existe = false;

                            System.out.println("Ingrese el nombre de la tarea la cual desea cambiar");
                            scn.nextLine();
                            String nombre_tarea = scn.nextLine();

                            for (Tarea tarea : lista_tareas) {
                                if (tarea.getNombre_tarea().equals(nombre_tarea)) {

                                    System.out.println("Cual es el nuevo nombre de la tarea");
                                    String nuevo_nombre = scn.nextLine();

                                    tarea.setNombre_tarea(nuevo_nombre);

                                    existe = true;
                                }

                            }
                            if (!existe) {
                                System.out.println("La tarea no existe");

                            }

                            break;
                        case 2:
                            existe = false;
                            System.out.println("Ingrese el nombre de la tarea la cual desea cambiar");
                            scn.nextLine();
                            nombre_tarea = scn.nextLine();
                            for (Tarea tarea : lista_tareas) {
                                if (tarea.getNombre_tarea().equals(nombre_tarea)) {

                                    System.out.println("Cual es la nueva duracion");
                                    String nueva_duracion = scn.nextLine();

                                    tarea.setDuracion(nueva_duracion);
                                    existe = true;

                                }

                            }
                            if (!existe) {
                                System.out.println("La tarea no existe");

                            }

                            break;
                        case 3:
                            existe = true;
                            System.out.println("Ingrese el nuevo propietario  de la tarea la cual desea cambiar");
                            scn.nextLine();
                            nombre_tarea = scn.nextLine();

                            for (Tarea tarea : lista_tareas) {

                                if (tarea.getNombre_tarea().equals(nombre_tarea)) {

                                    System.out.println("Cual es el nuevo propietario de la tarea");
                                    String nuevo_propietario = scn.nextLine();

                                    tarea.setPersona_encargada(nuevo_propietario);
                                    existe = false;

                                }

                            }
                            if (!existe) {
                                System.out.println("La tarea no existe");

                            }

                            break;
                        case 4:
                            existe = false;
                            System.out.println("Ingrese el nuevo estado de la tarea la cual desea cambiar");
                            scn.nextLine();
                            nombre_tarea = scn.nextLine();
                            for (Tarea tarea : lista_tareas) {
                                if (tarea.getNombre_tarea().equals(nombre_tarea)) {

                                    System.out.println("Cual es el nuevo estado de la tarea");
                                    String nuevo_estado = scn.nextLine();

                                    tarea.setPersona_encargada(nuevo_estado);

                                    existe = true;
                                }

                            }
                            if (!existe) {
                                System.out.println("La tarea no existe");

                            }

                            break;

                        default:
                            System.out.println("El dato no es valido");
                            break;

                    }
                    break;

                default:
                    System.out.println("La opcion ingresada no es valida");
                    break;
            }

        } while (!finalizar);

    }
}
