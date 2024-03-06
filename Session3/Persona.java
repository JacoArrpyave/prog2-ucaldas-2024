import java.util.Scanner;




public class Persona {
  
    public Scanner scn = new Scanner(System.in);
    public String name_person = "";
    public String address_person = "";
    public String email = "";

    public void inputDataUser() {
        System.out.println("Enter your name:  ");
        name_person = this.scn.nextLine();

        System.out.println("Enter your address: ");
        address_person = this.scn.nextLine();

        System.out.println("Enter your email: ");
        email = scn.nextLine();
    }

}
