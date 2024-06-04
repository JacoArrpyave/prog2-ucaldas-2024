package com.app.sustentacion.services;

import java.util.List;

import com.app.sustentacion.domain.Programa;

public interface ProgramaServices {

    List<Programa> mostrarProgramas();

    void guardarPrograma(Programa programa);

    Programa buscarPrograma(String nombre_programa);

}
