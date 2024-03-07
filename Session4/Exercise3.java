import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Exercise3 {
    Scanner scn = new Scanner(System.in);

    public Integer buscar(LinkedList<Integer> numeros) {
        System.out.println("Ingrese el numero que quiere buscar dentro de sus datos");
        return numeros.indexOf(scn.nextInt());


    }

    public LinkedList crear() {
        LinkedList<Integer> numeros = new LinkedList<>();
        System.out.println("Cuantos elementos quiere que tenga su Linkedlist");
        int tamaño = scn.nextInt();
        for (int i = 1; i < tamaño; i++) {
            System.out.println("Ingrese el numero que quiere que sea guardado");
            numeros.add(scn.nextInt());

        }

        return numeros;

    }

}
