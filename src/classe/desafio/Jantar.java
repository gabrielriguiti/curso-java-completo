package classe.desafio;

public class  Jantar {

    public static void main(String[] args) {

        Comida comida1 = new Comida("Arroz", 0.149);
        Comida comida2 = new Comida("Feijão", 0.223);
        Comida comida3 = new Comida("Carne", 0.170);

        Pessoa pessoa = new Pessoa("Gabriel", 87.3);

        double pesoPrato = comida1.peso + comida2.peso + comida3.peso;

        pessoa.peso = pessoa.peso + pesoPrato;

        System.out.println(pessoa.toString());
    }
}
