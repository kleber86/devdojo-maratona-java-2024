package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Ikki");
        p1.setIdade(-20);
        p1.imprime();
    }
}
