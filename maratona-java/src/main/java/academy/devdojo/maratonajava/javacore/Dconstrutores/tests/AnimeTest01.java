package academy.devdojo.maratonajava.javacore.Dconstrutores.tests;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {

  public static void main(String[] args) {
    Anime naruto = new Anime("Naruto", "TV", 220, "Shounen");
    naruto.imprime();

    Anime pokemon = new Anime("Pokemon", "TV", 1135, "Aventura");
    pokemon.imprime();
  }
}
