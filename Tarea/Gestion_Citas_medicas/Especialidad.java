// nombre (String): Nombre de la especialidad.
// descripcion (String): Descripción de la especialidad
public class Especialidad {
    private String nombre;
    private String descripcion;
    public Especialidad() {
    }
    public Especialidad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    @Override
    public String toString() {
        return "Especialidad [nombre=" + nombre + ", descripcion=" + descripcion + "]";
    }
    
}
