package fundamentos;

public class Inferencia {

    public static void main(String[] args){

        double a = 4.5;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro Texto";
        System.out.println(c);

        /***
         * c = 4.5;
         *
         * A linguagem não permite alterar o tipo da variavel do tipo inferente;
         */

        /***
         * var e;
         * e = 123.65;
         *
         * Variaveis declaradas devem ser iniciadas no momento de declaracao;
         */

        // O java permite variaveis do tipo double receber número inteiros
        a = 12;

    }
}
