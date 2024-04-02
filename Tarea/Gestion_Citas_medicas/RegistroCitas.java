// a. registrarPaciente(Paciente paciente): Agrega un paciente al registro. Este método debe realizar las mismas
// validaciones que el ejercicio anterior.
// b. registrarMedico(Medico medico): Agrega un médico al registro.
// c. registrarEspecialidad(Especialidad especialidad): Agrega una especialidad al registro.
// d. registrarCita(Cita cita): Registra una cita médica. Este método debe realizar las siguientes validaciones:
// i. El médico debe tener disponibilidad en la fecha y hora de la cita.
// ii. El paciente no debe tener otra cita en la misma fecha y hora.
// e. listarPacientes(): Imprime en la consola la información de todos los pacientes registrados.
// f. listarMedicos(): Imprime en la consola la información de todos los médicos registrados.
// g. listarEspecialidades(): Imprime en la consola la información de todas las especialidades registradas
// h. listarCitas(): Imprime en la consola la información de todas las citas registradas.
// i. buscarCitas(String filtro): Busca y retorna una lista de citas que coincidan con el filtro especificado. El filtro puede
// ser una cadena que se compara con el nombre del paciente, el médico, la especialidad o la fecha de la cita

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroCitas {
    ArrayList<Paciente> registroPaciente = new ArrayList<>();
    ArrayList<Medico> registroMedico = new ArrayList<>();
    ArrayList<Especialidad> registroEspecialidad = new ArrayList<>();
    ArrayList<Cita> registroCita = new ArrayList<>();
    Scanner scn = new Scanner(System.in);

    public Paciente crearPaciente() {
        System.out.println("Ingrese los datos del paciente:");
        System.out.println("Ingrese el nombre del paciente");
        String nombre = scn.nextLine();
        System.out.println("Ingrese la cedula del paciente");
        String cedula = scn.nextLine();
        System.out.println("Ingrese el teléfono del paciente");
        String telefono = scn.nextLine();
        System.out.println("Ingrese la dirección del paciente");
        String direccion = scn.nextLine();
        return new Paciente(nombre, cedula, telefono, direccion);
    }

    public void registrarPaciente(Paciente paciente) {
        boolean existePaciente = false;
        for (Paciente pacientes : registroPaciente) {
            if (paciente.getCedula().equals(pacientes.getCedula())) {
                existePaciente = true;
                break;

            }

        }
        if (!existePaciente) {
            registroPaciente.add(paciente);
        } else {
            System.out.println("Registro invalido");
        }
    }

    public void listarPacientes() {
        if (registroPaciente.size() > 0) {
            for (Paciente pacientes : registroPaciente) {
                System.out.println(pacientes);
            }

        } else {
            System.out.println("No nay pacientes registrados");
        }
    }

    public Medico crearMedico() {
        Especialidad especialidad = new Especialidad();

        System.out.println("Ingrese los datos del medico");

        System.out.println("Ingrese el nombre del medico");
        String nombre = scn.nextLine();

        System.out.println("Ingrese el codigo del medico");
        String codigoMedico = scn.nextLine();

        System.out.println("Ingrese el nombre de la especialidad");
        String nombreEspecialidad = scn.nextLine();

        boolean existeEspecialidad = false;
        for (Especialidad especialidades : registroEspecialidad) {
            if (especialidades.getNombre().equals(nombreEspecialidad)) {
                especialidad = especialidades;
                existeEspecialidad = true;
            }

        }
        if (!existeEspecialidad) {
            System.out.println("Esta especialidad no existe por lo tanto tiene que crear una nueva especializacion");
            especialidad = crearEspecialidad();

        }
        return new Medico(nombre, especialidad, codigoMedico);

    }

    public void registrarMedico(Medico medico) {
        boolean existeMedico = false;
        for (Medico medicos : registroMedico) {
            if (medicos.getCodigoMedico().equals(medico.getCodigoMedico())) {
                existeMedico = true;
                break;
            }
        }
        if (!existeMedico) {
            registroMedico.add(medico);
        } else {
            System.out.println("Registro invalido");
        }
    }

    public void listarMedicos() {
        if (registroMedico.size() > 0) {
            for (Medico medicos : registroMedico) {
                System.out.println(medicos);
            }

        } else {
            System.out.println("No nay medicos registrados");
        }
    }

    public Especialidad crearEspecialidad() {
        System.out.println("Ingrese los datos de la especialidad");
        System.out.println("ingrese el nombre de la especilidad");
        String nombre = scn.nextLine();
        System.out.println("ingrese la descripcion de la especilidad");
        String descripcion = scn.nextLine();
        return new Especialidad(nombre, descripcion);
    }

    public void registrarEspecialidad(Especialidad especialidad) {
        boolean existeEspecialidad = false;
        for (Especialidad especialidades : registroEspecialidad) {
            if (especialidad.getNombre().equals(especialidades.getNombre())) {
                existeEspecialidad = true;
                break;

            }

        }
        if (!existeEspecialidad) {
            registroEspecialidad.add(especialidad);
        } else {
            System.out.println("Registro invalido");
        }
    }

    public void listarEspecialidades() {
        if (registroEspecialidad.size() > 0) {
            for (Especialidad especialidades : registroEspecialidad) {
                System.out.println(especialidades);
            }

        } else {
            System.out.println("No nay especialidades registradas");
        }
    }

    public Cita crearCita() {
        Paciente paciente = new Paciente();
        Medico medico = new Medico();
        String estado = "pendiente";

        System.out.println(
                "Tenga en cuenta que para poder registrar la cita el paciente debe de estar registrado.Ingrese los datos de la cita");
        System.out.println("Ingrese la cedula del paciente");
        String cedulaPaciente = scn.nextLine();
        for (Paciente pacientes : registroPaciente) {
            if (pacientes.getCedula().equals(cedulaPaciente)) {
                paciente = pacientes;

            }
        }
        System.out.println("Estos son los doctores disponibles");
        listarMedicos();
        System.out.println("Ingrese el codigo del medico");
        String codigoMedico = scn.nextLine();
        for (Medico medicos : registroMedico) {
            if (medicos.getCodigoMedico().equals(codigoMedico)) {
                medico = medicos;
            }
        }
        System.out.println("Ingrese la fecha que desea la cita");
        System.out.println("Ingrese el año");
        int  año=scn.nextInt();
        System.out.println("Ingrese el mes(del 1 al 12)");
        int  mes=scn.nextInt();
        System.out.println("Ingrese el dia");
        int dia=scn.nextInt();
        Date fechaCita=new Date(año-1900,mes-1 , dia);
        scn.nextLine();
        System.out.println("Ingrese la hora dela cita");// como precondicion se establece que la hora no puede tener fallos
        String horaCita=scn.nextLine();
        return new Cita(paciente, medico,fechaCita, horaCita, estado);
    }
    public void registrarCita(Cita cita){

        if (!cita.getMedico().isEmpty() && !cita.getPaciente().isEmpty()) {
            boolean disponibilidadPaciente=true;
            boolean disponibilidadDoctor=true;
            ArrayList<Cita> citasPaciente=buscarCitas(cita.getPaciente().getNombre());
            ArrayList<Cita> citasDoctor=buscarCitas(cita.getMedico().getNombre());
            for (Cita citas : citasPaciente) {
                if (cita.citaMismoDia(citas.getFechaCita()) && cita.citaMismaHora(citas.getHoraCita())) {
                    disponibilidadPaciente=false;
                    break;
                }
            }   
            for (Cita citas : citasDoctor) {
                if (cita.citaMismoDia(citas.getFechaCita()) && cita.citaMismaHora(citas.getHoraCita())) {
                    disponibilidadDoctor=false;
                    break;
                }
            }   
            if (disponibilidadDoctor && disponibilidadPaciente) {
                registroCita.add(cita);
                
                
            }else{
                System.out.println("Registro invalido");
            }

            
        }else{
            System.out.println("Registro invalido");
        }

    }

    public ArrayList<Cita> buscarCitas(String filtro) {
        ArrayList<Cita> lista = new ArrayList<>();
        if (registroCita.size() > 0) {
            for (Cita citas : registroCita) {
                if (citas.getPaciente().getNombre().equals(filtro) || citas.getMedico().getNombre().equals(filtro)
                        || citas.concatenarFecha().equals(filtro)) {
                    lista.add(citas);

                }

            }

        }
        return lista;
    }
    public void listarCitas(){
        if (registroCita.size()>0) {
            for (Cita citas : registroCita) {
                System.out.println(citas);   
            }
        }else{
            System.out.println("No hay citas registradas");
        }
        
    }
    public void leerMedicosTxt(){
    
        try (BufferedReader reader = new BufferedReader(new FileReader("lista_medicos.txt"))) {
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                String[] bloques = linea.split(",");
                if (bloques.length == 4) {
                    String nombre = bloques[0];
                    String name_espec = bloques[1];
                    String des_espec = bloques[2];
                    Especialidad especialidad = new Especialidad(name_espec, des_espec);
                    String codigo = bloques[3];
                    registroMedico.add(new Medico(nombre, especialidad, codigo));
                    registrarEspecialidad(especialidad);
                    
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    public void leerPacientesTxt(){

    
        try (BufferedReader reader = new BufferedReader(new FileReader("lista_pacientes.txt"))) {
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                String[] bloques = linea.split(",");
                if (bloques.length == 4) {
                    String nombre = bloques[0];
                    String cedula = bloques[1];
                    String telefono = bloques[2];
                    String direccion = bloques[3];

                    registrarPaciente(new Paciente(nombre, cedula, telefono, direccion));
                }
            }
        } catch (IOException e) {
            System.out.print("Error al leer el archivo: " + e.getMessage());
        }
    }

}