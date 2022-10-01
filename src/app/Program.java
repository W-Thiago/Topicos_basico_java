package app;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);  // Locale SERVE PARA A MAQUINA reconhecer o separador .

        System.out.print("óla mundo");    // 'print' não tem quebra de linha
        System.out.println(" óla mundo "); //  'println' tem quebra de linha
        System.out.println("óla mundo");
        System.out.println("-----------");

        //Para escrever o conteúdo de uma variável com ponto flutuante
        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);// %.2f%n    %.2f=formataçao marcador  \n ou %n=Quebra de linha
        System.out.printf("%.4f%n", x);
        System.out.println("-----------");

         // Para concatenar varios elementos em uma mesmo comando de escrita usando o print / println
        System.out.println("RESULTADO = " + x + " METROS");
        System.out.println("-----------");

        // Para concatenar varios elementos em uma mesmo comando de escrita usando o printf
        System.out.printf("RESULTADO = %.2f metros%n", x);
        System.out.println("-----------");

            //   Marcadores de variaveis
           //%f = ponto flutuante
          //%d = inteiro
         //%s = texto
        //%n = quebra de linha

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
        System.out.println("-----------");
        System.out.println("-----------");

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 52920;
        char gender = 'F';

        Double price1 = 2100.0;
        Double price2 = 650.50;
        Double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n ", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n ", product2, price2);
        System.out.println();

        System.out.printf("Record: %d years old, code %d and gender: %s %n ", age, code, gender);
        System.out.printf("with eight decimal places: %.10f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);

    }
}
