package fundamentos.operadores;

public class DesafioAritmeticos {

    public static void main(String[] args){

       int a = 3 * 4 - 10;
       int b = (int) Math.pow(a, 3); // potênciação
       double c = Math.pow(a, 3);

       System.out.println(b);
       System.out.println(c);

       // Desafio
       double formAPart1 = (6 * (3 + 2));
       double formAPart2 = Math.pow(formAPart1,2);
       double formAPart3 = 3 * 2;
       double resulFormA = formAPart2 / formAPart3;

       double formBPart1 = (1 - 5) * (2 - 7);
       double formBPart2 = formBPart1 / 2;
       double resultFormB = Math.pow(formBPart2, 2);

       double dividendo = Math.pow((resulFormA - resultFormB), 3);
       double divisor = Math.pow(10,3);

       double resultado = dividendo / divisor;

       System.out.printf("O resultado do desafio é: %f", resultado);
    }
}
