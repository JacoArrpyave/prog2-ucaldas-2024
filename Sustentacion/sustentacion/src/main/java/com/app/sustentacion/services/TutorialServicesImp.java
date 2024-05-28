package com.app.sustentacion.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.sustentacion.domain.Tutorial;

@Service
public class TutorialServicesImp implements TutorialServices {
    
    private List<Tutorial>tutoriales=new ArrayList<>();
    @Override
    public List<Tutorial> tutoriales() {
        return tutoriales;

    }

    @Override
    public void SaveTutorial(Tutorial tutorial) {
        tutoriales.add(tutorial);
    }

}
