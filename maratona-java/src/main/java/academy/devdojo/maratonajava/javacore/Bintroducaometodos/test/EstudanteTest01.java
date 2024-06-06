package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {

    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        ImpressoraEstudante impressora01 = new ImpressoraEstudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Doko";
        estudante01.idade = 2000;
        estudante01.sexo = 'M';

        estudante02.nome = "Marin";
        estudante02.idade = 200;
        estudante02.sexo = 'F';

        impressora01.imprime(estudante01);

        impressora01.imprime(estudante02);

        System.out.println("####################");

        impressora01.imprime(estudante01);

        impressora01.imprime(estudante02);


    }
}
