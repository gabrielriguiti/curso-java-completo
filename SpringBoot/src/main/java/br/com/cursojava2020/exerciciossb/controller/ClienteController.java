package br.com.cursojava2020.exerciciossb.controller;

import br.com.cursojava2020.exerciciossb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente(){

        return new Cliente(29, "Pedro", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id){

        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping
    public Cliente obterClientPorId2(
            @RequestParam(name = "id", defaultValue = "1") int id){

        return new Cliente(id, "João Augusto", "111.222.333-44");

    }
}
