package pokemonapp;

import pokemonapp.model.Dresseur;
import pokemonapp.model.Inventaire;
import pokemonapp.model.Pokemon;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Inventaire Inventaire1 = new Inventaire(
                3,
                6,
                Dresseur1.getRandomPokemon()
                );

        Inventaire Inventaire2 = new Inventaire(
                3,
                6,
                Dresseur2.getRandomPokemon()
                );

        Dresseur Dresseur1 = new Dresseur(
                "Sacha",
                Inventaire1,
                1
        );

        Dresseur Dresseur2 = new Dresseur(
                "Toto",
                Inventaire2,
                2
        );

    }
}


