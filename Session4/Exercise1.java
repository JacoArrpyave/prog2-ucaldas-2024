public class Exercise1 {
    public static void sumaDeArreglos(){
        int [] arreglo = { 1,2,3,4,5,};
        int sumandoDeArreglo = 0;

        for (int i = 0; i < arreglo.length; i++) {
            sumandoDeArreglo+=arreglo[i];
            
        }
        System.out.println("la suma del arreglo es "+ sumandoDeArreglo);

    }
    
}
