public class Main {
    static Persona persona1 = new Persona();
    static Persona bryan = new Persona();

    static Animal inst_animal = new Animal();

    public static void main(String[] args) {
        // persona1.inputDataUser();
        // inst_animal.showInformation();

       Vehiculo[] vehiculos = new Vehiculo[3]; 

       vehiculos[0] = new Vehiculo(4, "rojo", true);
       vehiculos[1] = new Vehiculo(2, "azul", false);

       System.out.println(vehiculos[0].cantidadRuedas); // 4
       System.out.println(Vehiculo.cantidadDeVehiculos); // 2
    }
    
}
