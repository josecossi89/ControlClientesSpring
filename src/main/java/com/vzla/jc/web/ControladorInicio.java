package com.vzla.jc.web;

import com.vzla.jc.dao.PersonaDao;
import com.vzla.jc.domain.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaDao personaDao;
    @GetMapping("/")
    public String inicio(Model model) {
        
        var personas = personaDao.findAll();

        log.info("Ejecutando el controlador Spring MVC");

        model.addAttribute("personas", personas);
        return "index";
    }

}
