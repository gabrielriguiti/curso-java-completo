package oo.heranca.desafio;

public class Ferrari extends Carro {

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
}
