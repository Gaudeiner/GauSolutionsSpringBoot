package com.GS.GauSolutions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {

    @GetMapping("/")
    public String saludo(){
        return "Hi my love Solansh";
    }

    @GetMapping("/about")
    public String presentar(){
        return "presntacion loquis :)";
    }
}
