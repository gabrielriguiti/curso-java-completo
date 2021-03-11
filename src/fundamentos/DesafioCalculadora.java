package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args){
        // Ler num1
        // ler num2
        // + - * / %

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        System.out.print("Digite a operação (+,-,*,/,%):");
        String operador = scanner.next();

        scanner.close();

        double resultado = "+".equals(operador) ? num1 + num2 : 0;
        resultado = "-".equals(operador) ? num1 - num2 : resultado;
        resultado = "*".equals(operador) ? num1 * num2 : resultado;
        resultado = "/".equals(operador) ? num1 / num2 : resultado;
        resultado = "%".equals(operador) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado);
    }
}
