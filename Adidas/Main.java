import java.util.Scanner;


// Actividad calificable:
// 1. Listar todos los tennis running de talla 38
// 2. Listar todos los tennis classic que tengan más de 5 colores disponible
// 3. Listar todos los tennis running y classic que tengan un precio mayor a USD150
// 4. Listar todos los tennis running cuyo envio a casa no este disponible
public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int menu_option = 0;

        System.out.println("1. Mujer");
        System.out.println("2. Hombre");
        System.out.println("3. Salir");
        menu_option = input.nextInt();
        switch (menu_option) {
            case 1:
                WomanMenu instance_woman = new WomanMenu();
                instance_woman.option_menu();
                break;
            case 2:
                ManMenu instance_man = new ManMenu();
                instance_man.option_menu();
                break;
            case 3:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}