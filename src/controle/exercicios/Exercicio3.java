package controle.exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.printf("Média do aluno %.2f\n", media);

        if (media >= 7.0){

            System.out.println("Aprovado");

        } else if (media < 7.0 && media > 4.0){

            System.out.println("Recuperação");

        } else if (media < 4.0){

            System.out.println("Reprovado");
        }
    }
}
