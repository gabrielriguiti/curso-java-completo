package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio3{

    public static void main(String[] args){

        // Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso: ");

        float peso = scanner.nextFloat();

        System.out.print("Digite a altura: ");

        float altura = scanner.nextFloat();

        scanner.close();

        float imc = (float) (peso / (Math.pow(altura,2)));

        System.out.printf("O seu IMC é %.1f", imc);
    }
}
