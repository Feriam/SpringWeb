/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author juanm
 */
@RestController
public class Controlador {
    
 // EL SERVIDOR DE TEST LOCAL ES "localhost:8080"
    @GetMapping("/") // se coloca una ruta
    public String mensaje(){
        return "Hola Bitches";
    }
}
