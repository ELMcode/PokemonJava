package pokemonapp;

import pokemonapp.model.Dresseur;
import pokemonapp.model.Inventaire;
import pokemonapp.model.Pokemon;

import java.util.List;

public class Main {
    public static void main(String[] args){

        Dresseur Dresseur1 = new Dresseur(
                "Sacha",
                new Inventaire(
                        3,
                        6,
                        getRandomPokemon()
                )


        )

    }


