package com.darkcode.spring.app.repository;

import java.lang.reflect.Array;
import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_LenguajesProgramacion")
public class LenguajeProgramacionRepository {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;  
    @Column(name="lenguaje")
    private String lenguaje;  
    @Column(name="tipo_paradigma")
    private String tipo_paradxigma;  
    @Column(name="frameworks")
    private ArrayList<String> frameworks;  
      
    
}
