package com.darkcode.spring.app.repository;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_MASCOTA")
public class MascotaRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;
    @Column(name="nombre")
    private String nombre;
    @Column(name="sexo")
    private String sexo;
    @Column(name="edad")
    private String edad;
    @Column(name="nombre_clinica_veterinaria")
    private String nombre_clinica_veterinaria;
    
}
