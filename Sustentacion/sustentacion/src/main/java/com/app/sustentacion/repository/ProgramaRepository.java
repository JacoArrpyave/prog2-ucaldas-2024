package com.app.sustentacion.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TBL_PROGRAMA")
public class ProgramaRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nivel_estudio")
    private String nivel_estudio;
    @Column(name = "nombre_programa")
    private String nombre_programa;
    @Column(name = "cantidad_creditos")
    private int cantidad_creditos;
    @Column(name = "estado_programa")
    private boolean estado_programa;
}
