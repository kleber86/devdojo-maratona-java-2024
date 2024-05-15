package academy.devdojo.maratonajava.indroducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[] args) {
        double valorCarro = 30000;
        double valorParcela = 1000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela: " + parcela + " R$ "+valorParcela);
        }
    }
}
