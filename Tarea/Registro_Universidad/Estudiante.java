// nombre (String): Nombre completo del estudiante.
// codigo (String): Código único de identificación del estudiante.
// carrera (String): Carrera que estudia el estudiante.
// promedio (double): Promedio académico del estudiante.
// Se debe crear una clase RegistroEstudiantes con los siguientes métodos:
// a. agregarEstudiante(Estudiante estudiante): Agrega un estudiante al registro. Este método debe realizar las mismas
// validaciones que el ejercicio anterior.
// b. eliminarEstudiante(String codigo): Elimina el estudiante que coincida con el código especificado.
// c. listarEstudiantes(): Imprime en la consola la información de todos los estudiantes registrados.
// d. buscarEstudiantes(String filtro): Busca y retorna una lista de estudiantes que coincidan con el filtro especificado. El
// filtro puede ser una cadena que se compara con el nombre, el código o la carrera del estudiante. Cualquiera de los
// 3 filtros se deben permitir.
package Registro_Universidad;

/**
 * Estudiante
 */
public class Estudiante {

    private String nombre = "";
    private String codigo = "";
    private String carrera = "";
    private double promedio ;
    public Estudiante(String nombre, String codigo, String carrera, double promedio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getCarrera() {
        return carrera;
    }
    public double getPromedio() {
        return promedio;
    }
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", codigo=" + codigo + ", carrera=" + carrera + ", promedio=" + promedio
                + "]";
    }
    
}