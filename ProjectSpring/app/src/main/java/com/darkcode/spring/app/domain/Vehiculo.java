package com.darkcode.spring.app.domain;

import lombok.Data;

@Data
public class Vehiculo {
    private String tipo_vehiculo;
    private String marca;
    private String modelo;
    private String color;
    public Vehiculo(String tipo_vehiculo, String marca, String modelo, String color) {
        this.tipo_vehiculo = tipo_vehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
}
