package com.app.sustentacion.domain;

import lombok.Data;

@Data
public class Programa {
    private String nivel_estudio;
    private String nombre_programa;
    private int cantidad_creditos;
    private boolean estado;
    public Programa() {
    }
    public Programa(String nivel_estudio, String nombre_programa, int catidad_creditos, boolean estado) {
        this.nivel_estudio = nivel_estudio;
        this.nombre_programa = nombre_programa;
        this.cantidad_creditos = catidad_creditos;
        this.estado = estado;
    }
}
