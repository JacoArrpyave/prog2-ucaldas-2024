import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // // EJERCICIO 1
        // int[] numeros = { 1, 2, 3, 4, 5 };
        // Exercise1 exercise1 = new Exercise1();
        // System.out.println(exercise1.sumaDeArreglos(numeros));
        // System.out.println("********************");

        // // EJERCICIO 2
        // Exercise2 exercise2 = new Exercise2();

        // ArrayList<String> arreglo = new ArrayList<>();
        // arreglo.add("esposa");
        // arreglo.add("marido");
        // arreglo.add("casa");
        // arreglo.add("carro");
        // exercise2.agregar_Y_Eliminar(arreglo);
        // System.out.println("****************");

        // // Ejercicio 3
        // Exercise3 ejExercise3=new Exercise3();

        // @SuppressWarnings("unchecked")
        // LinkedList<Integer> numero = ejExercise3.crear();
        // System.out.println(ejExercise3.buscar(numero));

        // System.out.println("**************");

        // Ejercicio 4
        Scanner scn = new Scanner(System.in);
        boolean finalizar = false;
        ArrayList<Persona2> contactos = new ArrayList<>();

        do {
            System.out.println(
                    "Escriba 1 para crear nuevo contacto. \n Escriba 2 para eliminar contacto \n Escriba 3 para mostrar todos los contactos \n Escriba 4 para buscar un contacto \n Escriba 5 para salir del menu ");
            int opcion = scn.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Cuál es el nombre del contacto");
                    scn.nextLine();
                    String nombre = scn.nextLine();
                    System.out.println("Cuál es el teléfono del contacto");
                    String telefono = scn.nextLine();
                    System.out.println("Cuál es el email contacto");
                    String email = scn.nextLine();
                    contactos.add(new Persona2(nombre, email, telefono));

                    break;
                case 2:
                    System.out.println("Cual es el indice del contacto que va a borrar");
                    int index;

                    try {
                        index = scn.nextInt();

                    } catch (Exception e) {
                        System.out.println("el índice debe ser numérico");
                        break;
                    }

                    if (contactos.size() <= index) {
                        System.out.println("Error: el contacto no existe");

                    } else {
                        contactos.remove(index);

                    }
                    break;
                case 3:

                    for (Persona2 contacto : contactos) {
                        System.out.println(contacto.toString());
                    }

                    break;
                case 4:
                    System.out.println("Cuál es el nombre del contacto");
                    scn.nextLine();
                    String nombreBuscar = scn.nextLine();

                    for (Persona2 contacto : contactos) {
                        if (contacto.getNombre().equals(nombreBuscar)) {
                            System.out.println(contacto.toString());
                            break;
                        }

                    }
                    System.out.println("Error: el contacto no existe");
                    break;
                case 5:
                    finalizar = true;
                    break;
                default:
                    System.out.println("Esta opción es inváliada ");
                    break;
            }
        } while (!finalizar);

    }

}