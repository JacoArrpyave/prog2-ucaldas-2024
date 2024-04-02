
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
import java.util.Scanner;

public class Main {
    static RegistroCitas instanRegistroCitas = new RegistroCitas();
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        instanRegistroCitas.leerMedicosTxt();
        instanRegistroCitas.leerPacientesTxt();
        boolean esSalir = false;
        int opcion;
        System.out.println("Registro de citas");
        do {
            System.out.println(
                    "Menú\n Escoja 1) Registrar paciente\n Escoja 2) Registrar medico\n Escoja 3) Registrar especialidad\n Escoja 4) Registrar cita\n Escoja 5) Listar pacientes\n Escoja 6) Listar medicos\n Escoja 7) Listar especialidad\n Escoja 8) Listar citas\n Escoja 9) Buscar una cita por un filtro(El filtro puede ser ser una cadena que se compara con el nombre del paciente, el médico, la especialidad o la fecha de la cita)");
            opcion = scn.nextInt();
            switch (opcion) {
                case 1:
                    instanRegistroCitas.registrarPaciente(instanRegistroCitas.crearPaciente());
                    break;
                case 2:
                    instanRegistroCitas.registrarMedico(instanRegistroCitas.crearMedico());
                    break;
                case 3:
                    instanRegistroCitas.registrarEspecialidad(instanRegistroCitas.crearEspecialidad());
                    break;
                case 4:
                    instanRegistroCitas.registrarCita(instanRegistroCitas.crearCita());
                    break;
                case 5:
                    instanRegistroCitas.listarPacientes();
                    break;
                case 6:
                    instanRegistroCitas.listarMedicos();
                    break;
                case 7:
                    instanRegistroCitas.listarEspecialidades();
                    break;
                case 8:
                    instanRegistroCitas.listarCitas();
                    break;
                case 9:
                    System.out.println("Ingrese el filtro");

                    instanRegistroCitas.buscarCitas(scn.nextLine());
                    break;

                default:
                System.out.println("Opcion invalida");
                    break;
            }

        } while (!esSalir);

    }
}