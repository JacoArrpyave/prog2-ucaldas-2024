// paciente (Paciente): Paciente que tiene la cita.
// medico (Medico): Médico que atiende la cita.
// fechaCita (Date): Fecha de la cita.
// horaCita (String): Hora de la cita.
// estado (String): Estado de la cita (pendiente, confirmada, cancelada)

import java.sql.Date;

public class Cita {
    private Paciente paciente;
    private Medico medico;
    private Date fechaCita;
    private String horaCita;
    private String estado;
    public Cita(Paciente paciente, Medico medico, Date fechaCita, String horaCita, String estado) {
        this.paciente = paciente;
        this.medico = medico;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.estado = estado;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public Date getFechaCita() {
        return fechaCita;
    }
    public String getHoraCita() {
        return horaCita;
    }
    public String getEstado() {
        return estado;
    }
    public String concatenarFecha(){
        return fechaCita.getDate()+"/"+fechaCita.getMonth()+"/"+fechaCita.getYear();
    }
    public boolean citaMismoDia(Date fecha){
        return fecha.compareTo(fechaCita)==0;

    }
    public boolean citaMismaHora(String hora){
        return hora.equals(horaCita);
    }

    @Override
    public String toString() {
        return "Cita [paciente=" + paciente + ", medico=" + medico + ", fechaCita=" + fechaCita + ", horaCita="
                + horaCita + ", estado=" + estado + "]";
    }

    
}
