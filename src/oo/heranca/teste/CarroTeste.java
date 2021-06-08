package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

    public static void main(String[] args) {

        Carro civic = new Civic();
        Carro ferrari = new Ferrari();

        civic.acelerar();
        System.out.println(civic.toString());

        civic.acelerar();
        System.out.println(civic.toString());

        civic.acelerar();
        System.out.println(civic.toString());

        ferrari.acelerar();
        ferrari.frear();
        System.out.println(ferrari.toString());

        ferrari.acelerar();
        System.out.println(ferrari.toString());

        ferrari.acelerar();
        System.out.println(ferrari.toString());
    }
}
