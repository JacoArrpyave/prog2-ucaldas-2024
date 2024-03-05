import java.util.Scanner;
public class Animal {
    Scanner scn = new Scanner(System.in);

    public String animal_name = "";
    public String animal_especies = "";
    public String animal_color = "";

    public void showInformation() {
        System.out.println("Enter name for the animal:  ");
        animal_name = scn.nextLine();

        System.out.println("Enter animal species: ");
        animal_especies = scn.nextLine();

        System.out.println("Enter the color for the animal: ");
        animal_color = scn.nextLine();
    }
    
}
