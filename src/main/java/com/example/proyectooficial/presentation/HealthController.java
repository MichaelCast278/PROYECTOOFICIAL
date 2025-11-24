package com.example.proyectooficial.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String ping() {
        return "GradeCalculator API funcionando ✔";
    }
}
