package firts_api_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class HelloController {

    @GetMapping("/hello")
    public String  saludar(){

        return "Hola papu con api rest en SPRING BOOT";

    }

    @GetMapping("/suma")
    public String suma(){
        operaciones operacion = new operaciones();
        int resultado = operacion.sumar(10, 20);
        
        return "El resultado de la suma es: " + resultado;
    }
}

