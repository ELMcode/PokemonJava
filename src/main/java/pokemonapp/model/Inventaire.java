package pokemonapp.model;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private int nbPokemon;
    private int nbPokeball;

    private  List<Pokemon> pokemonsInventaire;

    public Inventaire(int nbPokemon, int nbPokeball, List<Pokemon> pokemonsInventaire) {
        this.nbPokemon = nbPokemon;
        this.nbPokeball = nbPokeball;
        this.pokemonsInventaire = pokemonsInventaire;
    }

    public int getNbPokemon() {
        return nbPokemon;
    }

    public void setNbPokemon(int nbPokemon) {
        this.nbPokemon = nbPokemon;
    }

    public int getNbPokeball() {
        return nbPokeball;
    }

    public void setNbPokeball(int nbPokeball) {
        this.nbPokeball = nbPokeball;
    }

    public List<Pokemon> getPokemonsInventaire() {
        return pokemonsInventaire;
    }

    public void setPokemonsInventaire(List<Pokemon> pokemonsInventaire) {
        this.pokemonsInventaire = pokemonsInventaire;
    }

    public void voirHpRestantPokemons(){

    }
}
