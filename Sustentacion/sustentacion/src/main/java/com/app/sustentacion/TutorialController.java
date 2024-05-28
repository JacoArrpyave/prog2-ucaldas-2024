package com.app.sustentacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.sustentacion.domain.Tutorial;
import com.app.sustentacion.services.TutorialServices;

@RestController

public class TutorialController {
    @Autowired
    private TutorialServices tutorialServices;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/tutoriales")
    public String listarTutorial(Model model) {
        model.addAttribute("tutorialListAttribute",tutorialServices.tutoriales());
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

}
