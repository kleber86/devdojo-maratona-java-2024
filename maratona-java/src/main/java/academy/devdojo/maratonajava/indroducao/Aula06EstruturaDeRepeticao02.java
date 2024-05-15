package academy.devdojo.maratonajava.indroducao;

public class Aula06EstruturaDeRepeticao02 {
    public static void main(String[] args) {
        for (int x = 0; x < 1000000; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }
    }
}
