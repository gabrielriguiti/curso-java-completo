package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){

        // Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");

        double num = scanner.nextDouble();

        scanner.close();

        double a2 = Math.pow(num,2);
        double a3 = Math.pow(num,3);

        System.out.printf("O número digitado ao quandro é %.2f, e a cubo é %.2f", a2, a3);
    }
}
