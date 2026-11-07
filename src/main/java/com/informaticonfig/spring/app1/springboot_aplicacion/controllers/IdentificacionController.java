package com.informaticonfig.spring.app1.springboot_aplicacion.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentificacionController {

    @GetMapping("/mi-instancia")
    public String miInstancia() {
        return "Aplicación de Jorge Emilio Nuñez Reyes - Pagina Activa";
    }
}