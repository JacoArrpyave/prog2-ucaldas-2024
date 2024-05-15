package com.darkcode.spring.app.domain;

import lombok.Data;

@Data
public class Mascota {
    private String nombre;
    private String sexo;
    private String edad;
    private String nombre_clinica_veterinaria;
    public Mascota(String nombre, String sexo, String edad, String nombre_clinica_veterinaria) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.nombre_clinica_veterinaria = nombre_clinica_veterinaria;
    }
    
}
