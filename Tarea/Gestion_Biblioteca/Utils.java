import java.util.Date;
import java.util.Scanner;

public class Utils {
    

     public static Date crearFecha(String titulo) {

        System.out.println(titulo);
        Scanner scn = new Scanner(System.in);

        System.out.println("Ingrese el año");
        int año = scn.nextInt();
        System.out.println("Ingrese el mes(Escoja el mes indicandose al numero del mes es edcir; del 1 al 12)");
        int mes = scn.nextInt();
        System.out.println("Ingrese el dia");
        int dia = scn.nextInt();
        return new Date(año + 1900, mes -1, dia);

    }

}
