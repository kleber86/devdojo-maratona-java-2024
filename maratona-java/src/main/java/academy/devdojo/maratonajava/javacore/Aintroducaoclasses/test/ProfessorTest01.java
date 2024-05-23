package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Ancião";
        professor.idade = 1000;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " idade: " +professor.idade +" anos Sexo: "+ professor.sexo);
    }
}
