package com.darkcode.spring.app;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.darkcode.spring.app.domain.Vehiculo;

import org.springframework.ui.Model;

@Controller
public class VehiculoController {
    @GetMapping("/vehiculos")
    public String vehiculos(Model model) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("moto", "audi", "A123", "blanco"));
        vehiculos.add(new Vehiculo("carro", "nissan", "B12", "blanco"));
        model.addAttribute("VehiculosAtributos",vehiculos);

        return "vehiculos";
    }

}
