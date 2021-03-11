package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){

        // Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        scanner.close();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo é %.2f", area);
    }
}
