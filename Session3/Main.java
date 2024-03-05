public class Main {
    static Person inst_person = new Person();
    static Animal inst_animal = new Animal();

    public static void main(String[] args) {
        inst_person.inputDataUser();
        inst_animal.showInformation();
        
    }
    
}
