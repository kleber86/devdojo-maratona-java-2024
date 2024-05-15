package academy.devdojo.maratonajava.indroducao;

public class Aula05EstruturaCondicionais06 {
    public static void main(String[] args) {
        byte dia = 9;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Informação inválida");
        }
    }
}
