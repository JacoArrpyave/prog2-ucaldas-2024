
package Registro_Universidad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroEstudiante {
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    Scanner scn = new Scanner(System.in);

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

    public Estudiante crearEstudiante() {
        String nombre = "";
        String codigo = "";
        String carrera = "";
        double promedio;
        System.out.println("Ingrese los datos del estudiante que va agregar.");
        System.out.println("Nombre del estudiante");
        nombre = scn.nextLine();
        System.out.println("Codigo del estudiante");
        codigo = scn.nextLine();
        System.out.println("Carrera del estudiante");
        carrera = scn.nextLine();
        System.out.println("Promedio del estudiante");
        promedio = scn.nextDouble();
        return (new Estudiante(nombre, codigo, carrera, promedio));
    }

    public void eliminarEstudiante(String codigo) {
        if (buscarEstudiantes(codigo).size()>0) {
            listaEstudiantes.remove(buscarEstudiantes(codigo).get(0));
            
        }else{
            System.out.println("Este codigo no esta registrado");
        }
    }

    public void mostrarEstudiantes(ArrayList<Estudiante> lista) {
        if (lista.size() > 0) {

            for (Estudiante estudiantes : lista) {
                System.out.println(estudiantes);
    
            }
        } else {
            System.out.println("No se encontro ningun estudiante");
        }

    }

    public ArrayList<Estudiante> buscarEstudiantes(String filtro) {
        ArrayList<Estudiante> filtroestudiantes = new ArrayList<>();
        boolean existeEstudiantes = false;
        for (Estudiante estudiantes : listaEstudiantes) {
            if (estudiantes.getCarrera().equals(filtro)
                    || estudiantes.getNombre().equals(filtro) || estudiantes.getCodigo().equals(filtro)) {
                filtroestudiantes.add(estudiantes);
                existeEstudiantes = true;

            }

        }
        if (!existeEstudiantes) {
            System.out.println("No hay estudiantes que tengan este filtro");

        }
        return filtroestudiantes;

    }
    public void leerTxt(){
         try (BufferedReader reader = new BufferedReader(new FileReader("Lista_Estudiantes.txt"))) {
            String linea = "";
            while ((linea = reader.readLine()) != null) {
                String[] bloques = linea.split(",");
                if (bloques.length == 4) {
                    String nombre = bloques[0];
                    String codigo = bloques[1];
                    String carrera = bloques[2];
                    Double promedio = Double.parseDouble(bloques[3]);
                    listaEstudiantes.add(new Estudiante(nombre, codigo, carrera, promedio));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}