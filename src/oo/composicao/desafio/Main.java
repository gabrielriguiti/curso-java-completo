package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Compra> compras = new ArrayList<>();

        Produto caneta = new Produto("Caneta", 100);
        Produto notebook = new Produto("Notebook", 2000);
        Produto caderno = new Produto("Caderno", 10);
        Produto impressora = new Produto("Impressora", 1000);

        List<Item> itensCompra1 = new ArrayList<>();
        itensCompra1.add(new Item(impressora, 1));
        itensCompra1.add(new Item(notebook, 2));

        compras.add(new Compra(itensCompra1));

        Cliente cliente = new Cliente("Gabriel Riguiti de Oliveira", compras);

        System.out.print("Compra N° 1\n\n");

        for (Item item : itensCompra1) {

            System.out.printf("Produto: %s -> Quantidade: %.2f -> Valor: %.2f -> Total: %.2f\n",
                    item.produto.nome, item.quantidade, item.produto.preco, item.getValorTotalItem());
        }

        List<Item> itensCompra2 = new ArrayList<>();
        itensCompra2.add(new Item(caneta, 1));
        itensCompra2.add(new Item(caderno, 10));

        compras.add(new Compra(itensCompra2));

        System.out.print("\nCompra N° 2\n\n");

        for (Item item : itensCompra2) {

            System.out.printf("Produto: %s -> Quantidade: %.2f -> Valor: %.2f -> Total: %.2f\n",

                    item.produto.nome, item.quantidade, item.produto.preco, item.getValorTotalItem());
        }

        System.out.printf("\nCliente: %s -> Qtd. compras: %d -> Valor total: %.2f",
                cliente.nome, cliente.compras.size(), cliente.getValorTotal());

    }
}
