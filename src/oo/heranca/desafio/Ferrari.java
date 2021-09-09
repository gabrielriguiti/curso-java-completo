package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{

    public Ferrari(){

        super(400);
    }

    @Override
    public void acelerar() {

        velocidadeAtual += 15;
    }

    @Override
    public void frear() {

        velocidadeAtual -= 15;
    }

    @Override
    public void ligarTurbo() {
        delta = 35;
    }

    @Override
    public void desligarTurdo() {

        desligarTurdo();
    }
}
