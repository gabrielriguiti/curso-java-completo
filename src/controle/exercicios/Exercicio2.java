package controle.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();

        if (ano % 4 == 0){

            System.out.println("O ano é bissexto");
        } else {

            System.out.println("O ano não é bissexto");
        }
    }
}
