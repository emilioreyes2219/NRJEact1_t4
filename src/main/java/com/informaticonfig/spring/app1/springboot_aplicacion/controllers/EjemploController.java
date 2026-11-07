package com.informaticonfig.spring.app1.springboot_aplicacion.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class EjemploController {

  @GetMapping("/detalles_info")
    public String info(Map<String, Object> modelo){
        modelo.put("Titulo", "Servidor en línea");
        modelo.put("Servidor", "Informaticonfig");
        modelo.put("Ip", "192.168.1.1");
        return "detalles_info";
    }
}