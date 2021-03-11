package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){

        // Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara.
        // Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        scanner.close();

        double delta = (Math.pow(b,2)) - (4 * a * c);

        System.out.printf("O delta é %.2f", delta);
    }
}
