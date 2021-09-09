package br.com.cursojava2020.exerciciossb.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}")
    public Double somar(@PathVariable Double a, @PathVariable Double b){

        return a + b;
    }

    @GetMapping("/subtrair")
    public Double subtrair(
            @RequestParam(name = "a") Double a,@RequestParam(name = "b") Double b){

        return a - b;
    }
}
