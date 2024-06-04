package com.app.sustentacion.services;

import java.util.List;

import com.app.sustentacion.domain.Tutorial;

public interface TutorialServices {

    List<Tutorial> showTutoriales();

    Tutorial searchTutorial(String nombre);


    void SaveTutorial(Tutorial tutorial);
}