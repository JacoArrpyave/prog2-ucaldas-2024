// nombre (String): Nombre completo del médico.
// especialidad (Especialidad): Especialidad del médico.
// codigoMedico (String): Código único de identificación del médico
public class Medico {
    private String nombre="";
    private Especialidad especialidad=new Especialidad();
    private String codigoMedico="";
    public Medico() {
    }
    public Medico(String nombre, Especialidad especialidad, String codigoMedico) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.codigoMedico = codigoMedico;
    }
    public String getNombre() {
        return nombre;
    }
    public Especialidad getEspecialidad() {
        return especialidad;
    }
    public String getCodigoMedico() {
        return codigoMedico;
    }
    public boolean isEmpty(){
        return codigoMedico.isEmpty();
    }
    @Override
    public String toString() {
        return "Medico [nombre=" + nombre + ", especialidad=" + especialidad + ", codigoMedico=" + codigoMedico + "]";
    }

}
