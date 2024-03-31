
package Registro_Universidad;

import java.util.ArrayList;

public class RegistroEstudiante {
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public void agregarEstudiante(Estudiante estudiante) {
        boolean estudianteExistente = false;
        for (Estudiante estudiantes : listaEstudiantes) {
            if (estudiante.getCodigo().equals(estudiantes.getCodigo())) {
                estudianteExistente = true;
                System.out.println("Este estudiante ya existe,no se puede agregrar. ");
                break;

            }

        }
        if (!estudianteExistente) {
            listaEstudiantes.add(estudiante);
            System.out.println("Estudiante registrado");

        }
    }

    public void eliminarEstudiante(String codigo) {
        boolean estudianteExistente = false;
        for (Estudiante estudiantes : listaEstudiantes) {
            if (codigo.equals(estudiantes.getCodigo())) {
                estudianteExistente = true;
                listaEstudiantes.remove(estudiantes);

                break;

            }

        }
        if (!estudianteExistente) {
            System.out.println("El estudiante con codigo " + codigo + " no extiste por lo tanto no se puede eliminar ");

        }
    }

    public void mostrarEstudiantes(ArrayList<Estudiante> registroEstudiantes) {

        for (Estudiante estudiantes : registroEstudiantes) {
            System.out.println(estudiantes);

        }

    }

    public ArrayList<Estudiante> buscarEstudiantes(String filtro) {
        ArrayList<Estudiante> filtroestudiantes = new ArrayList<>();
        boolean existeEstudiantes = false;
        for (Estudiante estudiantes : listaEstudiantes) {
            if (estudiantes.getCarrera().equals(filtro)
                    || estudiantes.getNombre().equals(filtro))|| estudiantes.getCodigo().equals(filtro){
                filtroestudiantes.add(estudiantes);
                existeEstudiantes = true;

            }

        }
        if (!existeEstudiantes) {
            System.out.println("No hay estudiantes que tengan este filtro");

        }
        return filtroestudiantes;

    }
  
}