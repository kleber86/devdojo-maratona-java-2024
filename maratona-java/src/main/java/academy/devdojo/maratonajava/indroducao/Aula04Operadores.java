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

        // (&&) AND || (OR) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrita = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrita = idade < 30 && salario >= 3400;

        System.out.println("isDentroDaLeiMaiorQueTrita " + isDentroDaLeiMaiorQueTrita);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrita);

        // OR
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystationCinco = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystationCinco || valorTotalContaPoupanca > valorPlaystationCinco;

        System.out.println("isPlaystationCincoCompravel: " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        int contador = 0;
        contador += 1; // 1
        contador ++; // É a mesma coisa que contador += 1

        System.out.println(contador);
    }
}
