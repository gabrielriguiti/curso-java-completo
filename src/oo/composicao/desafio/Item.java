package oo.composicao.desafio;

public class Item {

    Produto produto;
    double quantidade;

    Item(Produto produto, double quantidade) {

        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getValorTotalItem(){

        return quantidade * produto.preco;
    }
}
