import java.util.ArrayList;
import java.util.Scanner;

public class WomanMenu {

    Scanner input = new Scanner(System.in);

    public String showMenu() {
        return "            1. Calzado\n            2. Productos destacados\n           3.Ropa\n          4. Accesorios\n           5. Deportes\n";
    }

    public void option_menu() {
        Running womanRunningShoes = new Running();
        Classic instance_classic = new Classic();

        System.out.println(showMenu());
        int option = 0;
        int option_submenu = 0;
        option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Calzado\n       1. Running\n        2. Classic\n        Selecciona una opción:");
                option_submenu = input.nextInt();
                if (option_submenu == 1) {
                    womanRunningShoes.addRunningShoes();
                    System.out.println(womanRunningShoes.showInformationShoes(womanRunningShoes.running_shoes));
                    
                    System.out.println(womanRunningShoes.showInformationShoes(womanRunningShoes.shoes_size_38()));
                    System.out.println(womanRunningShoes.showInformationShoes(womanRunningShoes.shoes_send_house()));


                } else if (option_submenu == 2) {
                    instance_classic.addClassicShoes();

                    System.out.println(instance_classic.showInformationShoes(instance_classic.classic_Shoes));
                } else {
                    System.out.println("Opción no válida");
                }
                break;
            case 2:
                System.out.println("Productos destacados");
            case 3:
                System.out.println("Ropa");
            case 4:
                System.out.println("Accesorios");
            case 5:
                System.out.println("Deportes");
        }

        ArrayList<Shoes> allShoes = new ArrayList<Shoes>();
        allShoes.addAll(instance_classic.classic_Shoes);
        allShoes.addAll(womanRunningShoes.running_shoes);

        System.out.println(instance_classic.showInformationShoes(this.shoes_price_150(allShoes)));

    }

    public ArrayList<Shoes> shoes_price_150(ArrayList<Shoes> shoesList) {
        ArrayList<Shoes> shoesPrice = new ArrayList<>();

        for (Shoes shoes : shoesList) {
            if (shoes.price > 150) {
                shoesPrice.add(shoes);
            }
        }

        return shoesPrice;
    }
   

}