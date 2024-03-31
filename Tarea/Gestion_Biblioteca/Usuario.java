// nombre (String): Nombre completo del usuario.
// cedula (String): Cédula de identidad del usuario.
public class Usuario {
    private String nombre;
    private String cedula;
    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }
    @Override
    public String toString() {
        return "Usuario:\n Nombre del usuario=" + nombre + "\n Cedula del usuario=" + cedula ;
    }
    
    
}
