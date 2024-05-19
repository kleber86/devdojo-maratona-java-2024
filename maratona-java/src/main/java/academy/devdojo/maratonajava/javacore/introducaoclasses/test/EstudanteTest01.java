package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Shiryu";
        estudante.idade = 18;
        estudante.sexo = 'M';

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Ikki";
        estudante2.idade = 19;
        estudante2.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante2.nome);
    }
}
