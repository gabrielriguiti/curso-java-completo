package oo.composicao.desafio;

import java.util.List;

public class Compra {

    List<Item> itens;

    Compra(List<Item> itens) {

        this.itens = itens;
    }

    public double getValorCompra(){

        double valorCompra = 0.0;

        for (Item item : itens){

            valorCompra += item.getValorTotalItem();
        }

        return valorCompra;
    }
}
