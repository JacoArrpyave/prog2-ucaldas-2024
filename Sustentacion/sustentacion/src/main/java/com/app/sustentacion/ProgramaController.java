package com.app.sustentacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.sustentacion.domain.Programa;
import com.app.sustentacion.domain.Tutorial;
import com.app.sustentacion.services.ProgramaServices;

@Controller
public class ProgramaController {
    @Autowired
    private ProgramaServices programaServices;

    @GetMapping("/programas")
    public String listarTutorial(Model model) {
        model.addAttribute("programaListAttribute", programaServices.mostrarProgramas());
        return "programas";

    }

    @GetMapping("/new-programa")
    public String showAddTutoriales(Model model) {
        model.addAttribute("programa", new Programa());
        return "add_programa";
    }

    @PostMapping("/new-programa")
    public String guardarEmpelado(@ModelAttribute("programa") Programa programa) {
        programaServices.guardarPrograma(programa);
        return "redirect:/programas";
    }

    @GetMapping("/programa/{nombre}")
    public String searchTutorial(Model model, @PathVariable("nombre") String nombre) {

        model.addAttribute("programaAttribute", programaServices.buscarPrograma(nombre));
        return "programa";

    }

}
