package com.app.sustentacion.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import lombok.Data;


@Data
public class Tutorial {
    private Long id;
    private String nombre;
    private String descripcion;
    private String url;
    private boolean estado;
    private Date fecha;
    private String autor;
    public Tutorial() {
    }
    //no se crean los getter y setter porque Con la implementacion de el data se generan automaticamente
    public Tutorial(Long id, String nombre, String descripcion, String url, boolean estado, Date fecha,
            String autor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.url = url;
        this.estado = estado;
        this.fecha = fecha;
        this.autor = autor;
    }

}