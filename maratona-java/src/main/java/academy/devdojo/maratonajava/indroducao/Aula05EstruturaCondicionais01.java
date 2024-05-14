package academy.devdojo.maratonajava.indroducao;

public class Aula05EstruturaCondicionais01 {
    public static void main(String[] args) {
        if(true) System.out.println("Essa estrutura é valida");

        if(true)
            System.out.println("Essa estrutra também é valida");

        if(true){
            System.out.println("Essa estrutura é a mais utilizada");
        }

        int idade = 15;
        boolean isAutorizadoComprarBebidaAlcolica = idade >= 18;

        if(isAutorizadoComprarBebidaAlcolica){
            System.out.println("Autorizado a comprar bebida alcolica");
        }


        if(!isAutorizadoComprarBebidaAlcolica){
            System.out.println("Não autorizado a comprar bebida alcolica");
        }

        // if else
        int idade2 = 18;

        if (idade2 > 18) {
            System.out.println("Maior de idade: " + idade2);
        }else{
            System.out.println("Menor de idade: " + idade2);
        }
    }
}
