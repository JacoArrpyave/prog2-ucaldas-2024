// nombre (String): Nombre completo del paciente.
// cedula (String): Cédula de identidad del paciente.
// telefono (String): Teléfono del paciente.
// direccion (String): Dirección del paciente
public class Paciente {
    private String  nombre="";
    private String  cedula="";
    private String  telefono="";
    private String  direccion="";
    public Paciente() {
    }
    public Paciente(String nombre, String cedula, String telefono, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public boolean isEmpty(){
        return cedula.isEmpty();
    }
    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre + ", cedula=" + cedula + ", telefono=" + telefono + ", direccion="
                + direccion + "]";
    }

}
