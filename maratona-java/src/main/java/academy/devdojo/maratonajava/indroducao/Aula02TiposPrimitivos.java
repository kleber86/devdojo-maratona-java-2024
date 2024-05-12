package academy.devdojo.maratonajava.indroducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        /*
        int, double, float, char, byte, short, long, boolean
         */

        int idade = 10;
        long numeroGrande = 100000L;
        double salarioDouble = 200.00;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean  verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        String nome = "Seiya";


        System.out.println("A idade é " + idade + " anos.");
        System.out.println("Valor da variavel verdadeira BOOLEAN é " + verdadeiro);
        System.out.println("Valor da variavel caractere CHAR é " + caractere);

        // Casting
        int cast = (int) 100000000000000L;
        System.out.println("Retorno usando o casting " + cast);

        // String
        System.out.println("Meu nome é " + nome);
    }
}
