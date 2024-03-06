public class Vehiculo2 {
    public static int cantidadDeVehiculos = 0;

    public int cantidadRuedas;
    public String color;
    public boolean esGasolina;

    public Vehiculo(int cantidadRuedas, String color, boolean esGasolina){
        this.cantidadRuedas = cantidadRuedas;
        this.color = color;
        this.esGasolina = esGasolina;
        Vehiculo.cantidadDeVehiculos++;
    }
}
