package arrays;

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas notas você deseja informar? ");
        int qtdNotas = scanner.nextInt();

        double[] notas = new double[qtdNotas];

        for (int i = 0; i < notas.length; i++) {

            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double total = 0;

        for (double nota : notas) {

            total += nota;
        }

        System.out.print("A média final é " + total / qtdNotas);

        scanner.close();
    }
}
