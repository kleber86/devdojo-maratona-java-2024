package academy.devdojo.maratonajava.indroducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        System.out.println("Soma: " + n1 + n2);
        System.out.println("Subtração: " + (n1 - n2));
        System.out.println("Multiplicação: " + n1 * n2);
        System.out.println("Divisão: " + n1 / n2);

        // % - Resto de divisão
        System.out.println("Resto da divisão é: " + n1 % n2);
        System.out.println("Resto da divisão é: " + n2 % n1);
        System.out.println("Resto da divisão é: " + 1 % 6);

        // < > >= <= == - Operadores logicos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(n1 < n2);
        System.out.println(n1 > n2);
        System.out.println(n1 >= n2);
        System.out.println(n1 <= n2);
        System.out.println(n1 == n2);

    }
}
