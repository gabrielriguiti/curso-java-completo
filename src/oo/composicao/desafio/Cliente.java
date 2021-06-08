package oo.composicao.desafio;

import java.util.List;

public class Cliente {

    String nome;
    List<Compra> compras;

    Cliente(String nome, List<Compra> compras) {

        this.nome = nome;
        this.compras = compras;
    }

    public double getValorTotal() {

        double valorTotal = 0.0;

        for (Compra compra : compras) {

            valorTotal += compra.getValorCompra();
        }

        return valorTotal;
    }
}
