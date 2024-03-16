package Session5;

public class Tarea {
    private String nombre_tarea;
    private String duracion;
    private String persona_encargada;
    private String estado;


    public Tarea(String nombre_tarea, String duracion, String persona_encargada, String estado) {
        this.nombre_tarea = nombre_tarea;
        this.duracion = duracion;
        this.persona_encargada = persona_encargada;
        this.estado = estado;
    }

    public String getNombre_tarea() {
        return nombre_tarea;
    }

    public void setNombre_tarea(String nombre_tarea) {
        this.nombre_tarea = nombre_tarea;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getPersona_encargada() {
        return persona_encargada;
    }

    public void setPersona_encargada(String persona_encargada) {
        this.persona_encargada = persona_encargada;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

   
    public String toString() {
        return "Tarea [nombre de la tarea=" + nombre_tarea + ", Duracion=" + duracion + ", La tarea es de="
                + persona_encargada + ", Estado=" + estado + "]";
    }

}
