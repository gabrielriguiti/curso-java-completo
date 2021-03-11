package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args){

        // Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");

        double tempC = scanner.nextDouble();

        scanner.close();

        double tempF = (tempC * 1.8) + 32;

        System.out.printf("A temperatura em ° Fahrenheit é %.2f", tempF);
    }
}