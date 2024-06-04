package com.app.sustentacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.sustentacion.domain.Tutorial;
import com.app.sustentacion.services.TutorialServices;

@Controller

public class TutorialController {
    @Autowired
    private TutorialServices tutorialServices;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/tutoriales")
    public String listarTutorial(Model model) {
        model.addAttribute("tutorialListAttribute", tutorialServices.showTutoriales());
        return "tutoriales";

    }

    @GetMapping("/new-tutorial")
    public String showAddTutoriales(Model model) {
        model.addAttribute("tutorial", new Tutorial());
        return "add_tutorial";
    }

    @PostMapping("/new-tutorial")
    public String guardarEmpelado(@ModelAttribute("tutorial") Tutorial tutorial) {
        tutorialServices.SaveTutorial(tutorial);
        return "redirect:/tutoriales";
    }

    @GetMapping("/tutorial/{nombre}")
    public String searchTutorial(Model model, @PathVariable("nombre") String nombre) {
       
        model.addAttribute("tutorialAttribute", tutorialServices.searchTutorial(nombre));
        return "tutorial";

    }

}
