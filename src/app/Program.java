package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);  // Locale SERVE PARA A MAQUINA reconhecer o separador .
        Scanner sc = new Scanner(System.in); //Para fazer entrada de DADOS

       /* System.out.print("óla mundo");    // 'print' não tem quebra de linha
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


        //aula de Entrada de dados em Java

        String x; //Para ler uma palavra
        x = sc.next();
        System.out.println("voce digitou: " + x);

        int a; //Para ler um número inteiro
        a = sc.nextInt();
        System.out.println("voce digitou: " + a);

        double y; //Para ler um número com ponto flutuante
        y =sc.nextDouble();
        System.out.printf("voce digitou: %.2f%n " , y);

        char b; //para ler um caractere
        b = sc.next().charAt(0);
        System.out.println("voce digitou: " + b);


        //Para ler um texto ATÉ A QUEBRA DE LINHA chama o nextLine
        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // ATENÇÃO: quebra de linha pendente
        int x;
        String s4, s5, s6;

        x = sc.nextInt();
        sc.nextLine();            // Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão.//
        s4 = sc.nextLine();      // Solução: Faça um nextLine() extra antes de fazer o nextLine() de seu interesse.//
        s5 = sc.nextLine();
        s6 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(x);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);*/

        // aula estrutura condicional -------------------------------------
       /* int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if(hora < 12) {
            System.out.println("Bom dia");
        }
        else if (hora < 18 ) {
            System.out.println("boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }

        //EXERCICIO 1 ---------------------------------------------
        double nota1;
        double nota2;
        double som;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        som = nota1 + nota2;

        if(som > 60.00) {
            System.out.println("nota final = " + som);
            System.out.println("APROVADO");
        }
        else {
            System.out.println("nota final = " + som);
            System.out.println("REPROVADO");
        }

        //EXERCICIO 2 ----------------------------------------
        int n1;
        int n2;
        int n3;

        System.out.print("Primeiro valor: ");
        n1 = sc.nextInt();
        System.out.print("Segundo valor: ");
        n2 = sc.nextInt();
        System.out.print("terceiro valor: ");
        n3 = sc.nextInt();

        if (n1 < n2) {
            System.out.println("MENOR = " + n1);
        }
        else if (n2 < n3) {
            System.out.println("MENOR = " + n2);
        }
        else {
            System.out.println("MENOR = " + n3);
        }*/

        double minutos;
        double som;
        double preco = 50.00;

        System.out.print("Digite a quantidade de minutos: ");
        minutos = sc.nextDouble();


        if(minutos <= 100) {
            System.out.printf("Valor a pagar : R$ %.2f%n  " , preco);
        }
        else {
            preco = preco + (minutos - 100) * 2;
            System.out.printf("Valor a pagar : R$ %.2f%n  " , preco );
        }




        sc.close();

    }
}
