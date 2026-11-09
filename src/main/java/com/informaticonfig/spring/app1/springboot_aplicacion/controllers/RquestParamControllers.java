package com.informaticonfig.spring.app1.springboot_aplicacion.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/parametros")
public class RquestParamControllers {

@GetMapping("/detalle")
public ParametroDTO detalle(@RequestParam(required = false, defaultValue = "hola a todos") String informacion) {
    ParametroDTO parametro1 = new ParametroDTO();
    parametro1.setInformacion(informacion);
    
    return parametro1;
}
@GetMapping("/saludo")
    public String saludar(@RequestParam(name = "nombre", defaultValue = "Invitado") String nombre) {
        return "Hola bienvenido, " + nombre + "!";
    }
}