import Pokemones.Bulbasur;
import Pokemones.Pokemon;

import java.util.Scanner;
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Bulbasur bulbasur = new Bulbasur( "Bulbasur" , 45, 49 , 49 , 65 , 65 ,45, 12 );
    System.out.println("Hola como estas cual es tu nombre?");
    String name = scanner.nextLine();
    Entrenador entrenador = new Entrenador(name);

    entrenador.presentacionEntrenador();

    System.out.println("Recibe tu primer pokemon Bulbasur");

    entrenador.setPokemonList();

}//main

