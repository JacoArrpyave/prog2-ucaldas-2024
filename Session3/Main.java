public class Main {
    static Persona pipe = new Persona();
    static Persona jacobo = new Persona();
    static Persona jaider =new Persona();
    static Vehiculo carro=new Vehiculo(4, "rojo", false);
    

    static Animal inst_animal = new Animal();

    public static void main(String[] args) {
            pipe.inputDataUser();
        inst_animal.showInformation();

       Vehiculo[] vehiculos = new Vehiculo[3]; 

       vehiculos[0] = new Vehiculo(4, "rojo", true);
       vehiculos[1] = new Vehiculo(2, "azul", false);

       System.out.println(vehiculos[0].cantidadRuedas); // 4
       System.out.println(Vehiculo.cantidadDeVehiculos); // 2
       
       
    }
        
}
