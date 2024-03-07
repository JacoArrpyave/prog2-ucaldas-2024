public class Exercise1 {

    public int sumaDeArreglos(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        return suma;
    }
}