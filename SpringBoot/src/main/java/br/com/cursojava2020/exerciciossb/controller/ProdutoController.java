package br.com.cursojava2020.exerciciossb.controller;

import br.com.cursojava2020.exerciciossb.model.entities.Produto;
import br.com.cursojava2020.exerciciossb.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public Produto novoProduto(Produto produto){

        produtoRepository.save(produto);

        return produto;
    }
}
