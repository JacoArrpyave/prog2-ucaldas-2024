package com.darkcode.spring.app;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.darkcode.spring.app.domain.Mascota;


@Controller
public class MascotaController {
    @GetMapping("/mascotas")
    public String mascotas(Model model){
        ArrayList<Mascota>mascotas= new ArrayList<>();
        mascotas.add(new Mascota("abby", "Femenino", "2", "no tiene"));
        mascotas.add(new Mascota("danna", "Femenino", "6", "no tiene"));
        model.addAttribute("mascotasAtributos", mascotas);
        return "mascotas";

    }
    
}
