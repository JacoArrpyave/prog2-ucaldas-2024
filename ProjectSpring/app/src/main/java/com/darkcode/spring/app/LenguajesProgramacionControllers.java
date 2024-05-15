package com.darkcode.spring.app;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.darkcode.spring.app.domain.LenguajeProgramacion;

@Controller
public class LenguajesProgramacionControllers {
    @GetMapping("/lenguajes")
    public String lenguajes(Model model){
        ArrayList<LenguajeProgramacion> lenguajes=new ArrayList<>();
        ArrayList<String> frameworks1=new ArrayList<>();
        frameworks1.add("maven");
        ArrayList<String> frameworks2=new ArrayList<>();
        frameworks2.add("no se");
        frameworks2.add("tampoco se");
        lenguajes.add(new LenguajeProgramacion("java", "orientada a objetos", frameworks1));
        lenguajes.add(new LenguajeProgramacion("c++", "orientada a interfaces", frameworks2));
        model.addAttribute("lenguajesAtributos",lenguajes);
        return "lenguajes";
        
    }
}
