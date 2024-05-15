package academy.devdojo.maratonajava.indroducao;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // while
        int count = 0;
        while(count <= 10){
            System.out.println(count);
            count++; // count = count + 1 ou count += 1
        }

        // do while
        count = 0;
        do {
            System.out.println("Contador do-while "+count);
            count++;
        }while(count < 10);

        // for
        for (int i = 0; i <= 10; i++) {
            System.out.println("Contador for: "+i);
        }
    }
}
