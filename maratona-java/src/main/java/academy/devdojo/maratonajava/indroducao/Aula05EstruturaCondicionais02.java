package academy.devdojo.maratonajava.indroducao;

public class Aula05EstruturaCondicionais02 {
    public static void main(String[] args) {
        int idade = 18;
        String categoria;

        if(idade <= 15){
            categoria = "Categoria ifantil";
        }else if(idade > 15 && idade < 18){
            categoria ="Categoria juvenil";
        }else{
            categoria = "Categoria adulto";
        }

        System.out.println(categoria);
    }
}
