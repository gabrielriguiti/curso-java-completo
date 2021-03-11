package controle;

public class DesafioFor {

    public static void main(String[] args) {

        String valor = "#";

        for (int i = 1; i <= 5; i++){
            System.out.println(valor);
            valor += "#";
        }

        System.out.println();

        // Versão do desafio
        // Não pode usar valor numérico para controlar o laço
        for (String valorDesafio = "*"; valorDesafio.length() <= 10;valorDesafio += "*"){
            System.out.println(valorDesafio);
        }
    }
}
