package academy.devdojo.maratonajava.javacore.Csobrecargametodos.tests;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {

  public static void main(String[] args) {
    Anime anime2 = new Anime();


    anime2.init("CDZ", "TV", 240, "Ação");
    anime2.imprime();
  }
}
