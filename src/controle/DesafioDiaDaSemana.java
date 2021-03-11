package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");

        String diaDaSemana = scanner.next();

        if (diaDaSemana.equalsIgnoreCase("DOMINGO")){
            System.out.println(diaDaSemana + " -> 1");
        } else if (diaDaSemana.equalsIgnoreCase("SEGUNDA")){
            System.out.println(diaDaSemana + " -> 2");
        } else if (diaDaSemana.equalsIgnoreCase("TERÇA")
                || (diaDaSemana.equalsIgnoreCase("TERCA"))){
            System.out.println(diaDaSemana + " -> 3");
        } else if (diaDaSemana.equalsIgnoreCase("QUARTA")){
            System.out.println(diaDaSemana + " -> 4");
        } else if (diaDaSemana.equalsIgnoreCase("QUINTA")){
            System.out.println(diaDaSemana + " -> 5");
        } else if (diaDaSemana.equalsIgnoreCase("SEXTA")){
            System.out.println(diaDaSemana + " -> 6");
        } else if (diaDaSemana.equalsIgnoreCase("SÁBADO")
                || diaDaSemana.equalsIgnoreCase("SABADO")){
            System.out.println(diaDaSemana + " -> 7");
        } else {
            System.out.println("Dia inválido!");
        }

        scanner.close();
    }
}
