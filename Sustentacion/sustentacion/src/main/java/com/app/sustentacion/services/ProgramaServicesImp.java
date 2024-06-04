package com.app.sustentacion.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.sustentacion.domain.Programa;
@Service
public class ProgramaServicesImp implements ProgramaServices {
    List<Programa> programas = new ArrayList<>();

    @Override
    public List<Programa> mostrarProgramas() {
        return programas;

    }

    @Override
    public void guardarPrograma(Programa programa) {
        programas.add(programa);

    }

    @Override
    public Programa buscarPrograma(String nombre_programa) {
        return programas.stream().filter(programa -> programa.getNombre_programa().equals(nombre_programa))
        .findFirst()
        .orElse(null);
    }

    

}
