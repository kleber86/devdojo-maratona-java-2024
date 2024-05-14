package academy.devdojo.maratonajava.indroducao;

public class Aula05EstruturaCondicionais03 {
    public static void main(String[] args) {
        int salario = 4000;
        String mensagemDoar = "Eu vou doar 500 ao DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter.";
        // (condição) ? verdadeiro : falso
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
