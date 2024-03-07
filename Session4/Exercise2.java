import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    Scanner scn = new Scanner(System.in);

    public void agregar_Y_Eliminar(ArrayList<String> arrayLists) {

        System.out.println("Este es el arreglo que usted puede modificar");
        for (int i = 0; i < arrayLists.size(); i++) {
            System.out.print(arrayLists.get(i) + ",");

        }
        System.out.println("");
        arrayLists=agregar(arrayLists);
        arrayLists = eliminar(arrayLists);
        for (int i = 0; i < arrayLists.size(); i++) {
            System.out.println(arrayLists.get(i));
            
        }

    }
    //Elimina la posicion ingresada por el usuario
    public ArrayList eliminar(ArrayList<String> arrayList) {
        System.out.println("cuantos elementos quiere eliminar");
        int num=scn.nextInt();
        

        for (int i = 0; i < num; i++) {
            System.out.println("¿Que posicion quiere eliminar?");
            int posicion=scn.nextInt();
            
            arrayList.remove(posicion);
            
        }

        return arrayList;
    }


    //Pregunta y agrega los datos ingresados por el usuario

    public ArrayList agregar(ArrayList<String> arrayList) {
        System.out.println("Cuantos elementos quiere agregar");
        int num=scn.nextInt();
        scn.nextLine();

        for (int i = 0; i <num; i++) {

            System.out.println("ingrese la cadena que quiere agregar");
            
            String cadena=scn.nextLine();
            arrayList.add(cadena);
            
            
            
        }

        return arrayList;
    }

    

}
