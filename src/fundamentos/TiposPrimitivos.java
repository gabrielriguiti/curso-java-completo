package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args ){

        // Informações do funcionario

        // Tipo numéricos inteiros
        byte anosDeEmpresa = 23; // até 128
        short numeroDeVoos = 542; // até 32768
        int id = 56789; // até 2 milhões...
        long pontosAcumulados = 3_234_845_223L;

        // Tipo numéricos reais
        float salario = 11_45.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false; // true

        // Tipo caractere
        char status = 'A'; // ativo

        // Dias de Empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
