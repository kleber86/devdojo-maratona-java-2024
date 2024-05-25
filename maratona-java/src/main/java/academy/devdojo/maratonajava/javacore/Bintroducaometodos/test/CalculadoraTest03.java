package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(10, 0);
        double resultado2 = calculadora.divideDoisNumeros2(10, 0);

        System.out.println(resultado);
        System.out.println(resultado2);
        System.out.println("------");
        calculadora.imprimeDivisaoDoisNumeros(10, 0);
    }
}
