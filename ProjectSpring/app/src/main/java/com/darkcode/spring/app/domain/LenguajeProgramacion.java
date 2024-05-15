package com.darkcode.spring.app.domain;

import java.util.ArrayList;

import lombok.Data;

@Data
public class LenguajeProgramacion {
    private String lenguaje;
    private String tipo_paradigma;
    private ArrayList<String> frameworks;
    public LenguajeProgramacion(String lenguaje, String tipo_paradigma, ArrayList<String> frameworks) {
        this.lenguaje = lenguaje;
        this.tipo_paradigma = tipo_paradigma;
        this.frameworks = frameworks;
    }
    
}
