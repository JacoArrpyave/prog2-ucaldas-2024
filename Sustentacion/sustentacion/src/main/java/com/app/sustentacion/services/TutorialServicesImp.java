package com.app.sustentacion.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.sustentacion.domain.Tutorial;

@Service
public class TutorialServicesImp implements TutorialServices {

    private List<Tutorial> tutoriales = new ArrayList<>();

    @Override
    public List<Tutorial> showTutoriales() {
        return tutoriales;

    }

    @Override
    public void SaveTutorial(Tutorial tutorial) {
        tutoriales.add(tutorial);
    }

    @Override
    public Tutorial searchTutorial(String nombre) {


        return tutoriales.stream().filter(tutorial -> tutorial.getNombre().equals(nombre))
        .findFirst()
        .orElse(null);
    }


}
