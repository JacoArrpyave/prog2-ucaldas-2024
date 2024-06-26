// nombre (String): Nombre completo del autor.
// nacionalidad (String): Nacionalidad del autor
public class Autor {
    private String nombre;
    private String nacionalidad;
    public Autor() {
    }
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    @Override
    public String toString() {
        return "Autor\n Nombre del autor =" + nombre + "\n Nacionalidad del autor=" + nacionalidad ;
    }
}
