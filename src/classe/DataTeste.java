package classe;

public class DataTeste {

    public static void main(String[] args) {

        Data data1 = new Data();
        data1.imprimirDataFormatada();
        data1.dia = 28;
        data1.mes = 1;
        data1.ano = 2021;

        var data2 = new Data();
        data2.dia = 05;
        data2.mes = 9;
        data2.ano = 2021;

        System.out.println(data1.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());

        System.out.println("\n--------- Desafio ---------");
        Data data1Desafio = new Data();
        System.out.println(data1Desafio.obterDataFormatada());

        Data data2Desafio = new Data(2,2,2021);
        System.out.println(data2Desafio.obterDataFormatada());
    }
}
