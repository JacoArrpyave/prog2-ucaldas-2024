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
    private boolean publicado;
    private Date fecha;
    private String autor;
    public Tutorial() {
    }
    //no se crean los getter y setter porque Con la implementacion de el data se generan automaticamente
    public Tutorial(Long id, String nombre, String description, String url, boolean publicado, Date fecha,
            String autor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = description;
        this.url = url;
        this.publicado = publicado;
        this.fecha = fecha;
        this.autor = autor;
    }

}