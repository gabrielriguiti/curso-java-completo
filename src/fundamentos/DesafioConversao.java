package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite abaixo seus 3 últimos salario: ");

        String salario1 = scanner.nextLine().replace(",",".");
        String salario2 = scanner.nextLine().replace(",",".");;
        String salario3 = scanner.nextLine().replace(",",".");;

        scanner.close();

        double soma = Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3);
        double media = soma / 3;

        System.out.println(soma);
        System.out.println(media);
    }
}
