package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salarios == null) {
            return;
        }
        for (double salario : this.salarios) {
            System.out.print(salario + " ");
        }


    }

    public void imprimeMediaSalarial() {

        if (salarios == null) {
            return;
        }

        double media = 0;

        for (double salario : this.salarios) {
            media += salario;
        }

        media /= this.salarios.length;
        System.out.println("\nMedia salarial: " + media);
    }
}
