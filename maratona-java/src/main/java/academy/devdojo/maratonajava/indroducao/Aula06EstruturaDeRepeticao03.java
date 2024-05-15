package academy.devdojo.maratonajava.indroducao;

public class Aula06EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        int valorMax = 50;
        for (int x = 0; x <= valorMax; x++) {
            if (x > 25){
                break;
            }
            System.out.println(x);
        }
    }
}
