package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

    public static void main(String[] args){

        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("O serviço de terça foi executado?");

        if (scanner.nextLine().equals("V")){
            trabalhoTerca = true;
        }

        System.out.println("O serviço de quinta foi executado?");

        if (scanner.nextLine().equals("V")){
            trabalhoQuinta = true;
        }

        if (trabalhoQuinta && trabalhoTerca){
            System.out.println("A TV de 50 polegadas será comprada.");
        } else if (trabalhoQuinta || trabalhoTerca){
            System.out.println("A TV de 32 polegadas será comprada.");
        }

        if (trabalhoQuinta || trabalhoTerca){
            System.out.println("A família tomará sorvete.");
        }
    }
}
