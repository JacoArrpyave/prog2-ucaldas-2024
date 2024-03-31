// nombre (String): Nombre de la categoría.
// descripcion (String): Descripción de la categoría
public class Categoria {
    private String nombre;
    private String descripcion;
    public Categoria() {
    }
    public Categoria(String nombre, String descripcion) {
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
        return "Categoria [nombre=" + nombre + ", descripcion=" + descripcion + "]";
    }

}
