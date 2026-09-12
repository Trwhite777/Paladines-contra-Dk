import Exepciones.Exepcions;
import Pokemones.Pokemon;

import java.util.ArrayList;

public class Entrenador {

    private new ArrayList<Pokemon> pokemonList <Pokemon>(6) ;
    final private String NAMEUSER;
    final private int IDENTRENADOR = 6531;
    private int Dinero = 0;

    public Entrenador(String nameuser) {
        NAMEUSER = setNAMEUSER(nameuser);
    }
    public ArrayList<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public Entrenador setPokemonList(Pokemon pokemon) {
        pokemonList.add(pokemon);
        this.pokemonList = pokemonList;
        return this;
    }

    public String getNAMEUSER() {
        return NAMEUSER;
    }

    public String setNAMEUSER(String nameUser) {
        return  Exepcions.textosVacios(nameUser);
    }

    public int getIdEntrenador() {
        return IDENTRENADOR;
    }

    public void presentacionEntrenador () {
        System.out.println("Hola soy el entrenador" + getNAMEUSER());
        System.out.println("Y mi id es esta " + getIdEntrenador());
    }

    public void showPokemon () {
        pokemonList.
    }


}
