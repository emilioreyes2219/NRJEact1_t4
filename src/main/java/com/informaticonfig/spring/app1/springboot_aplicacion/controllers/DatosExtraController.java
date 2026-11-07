package com.informaticonfig.spring.app1.springboot_aplicacion.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatosExtraController {

    @GetMapping("/perfil")
    public Map<String, Object> obtenerPerfil() {
        Map<String, Object> perfil = new HashMap<>();
        perfil.put("Nombre", "Jorge Emilio");
        perfil.put("Carrera", "Ingeniería en Sistemas");
        perfil.put("Semestre", "Noveno");
        perfil.put("Institucion", "Instituto Tecnológico de Oaxaca");
        return perfil;
    }

    @GetMapping("/estado")
    public String obtenerEstado() {
        return "El servidor está funcionando correctamente .";
    }
}