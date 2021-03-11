package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){

        // Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em ° Fahrenheit: ");

        double tempF = scanner.nextDouble();

        scanner.close();

        double tempC = (tempF - 32) / 1.8;

        System.out.printf("A temperatura em ° Celsius é %f", tempC);
    }
}
