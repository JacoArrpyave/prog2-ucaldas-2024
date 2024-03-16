public class Vehiculo {
    public static int cantidadDeVehiculos = 0;

    public int cantidadRuedas;
    public String color;
    public boolean esGasolina;

    public static void inputDataCar(){
        
    }

    public Vehiculo(int cantidadRuedas, String color, boolean esGasolina){
        this.cantidadRuedas = cantidadRuedas;
        this.color = color;
        this.esGasolina = esGasolina;
        Vehiculo.cantidadDeVehiculos++;
    }
}
