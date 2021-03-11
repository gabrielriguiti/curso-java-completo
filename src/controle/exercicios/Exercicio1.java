package controle.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero >= 0 && numero <= 10){

            if (numero % 2 == 0){
                System.out.printf("O número %f está entre 0 e 10, e é par.",numero);
            } else {
                System.out.printf("O número %f está entre 0 e 10, e não é par.",numero);
            }
        } else {
            if (numero % 2 == 0){
                System.out.printf("O número %f nãao está entre 0 e 10, e é par.",numero);
            } else {
                System.out.printf("O número %f não está entre 0 e 10, e não é par.",numero);
            }
        }

    }
}
