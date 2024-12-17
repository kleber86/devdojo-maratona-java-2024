package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ikki");
        funcionario.setIdade(14);
        funcionario.setSalarios(new double[]{1500, 2000, 1700});


        funcionario.imprime();
        funcionario.imprimeMediaSalarial();
    }
}
