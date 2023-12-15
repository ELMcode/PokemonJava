package pokemonapp.model;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
class Dresseur implements Arene {

    private String nom;

    private Inventaire inventaire;

    private int equipe;

    public Dresseur(String nom, Inventaire inventaire, int equipe) {
        this.nom = nom;
        this.inventaire = inventaire;
        this.equipe = equipe;
    }

    public Inventaire getInventaire() {
        return inventaire;
    }

    public void setInventaire(Inventaire inventaire) {
        this.inventaire = inventaire;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public int getEquipe() {
        return equipe;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    public void utiliserInventaire(){

    }

    public void getRandomPokemon() throws  Exception {

        ObjectMapper mapper = new ObjectMapper();
        List<Pokemon> allPokemons = mapper.readValue(new File("../data/Pokemons.json"), new TypeReference<List<Pokemon>>(){});

        System.out.println(allPokemons);
    }

    public void changerPokemonPendantCombat(){

    }

    @Override
    public void debuterCombat() {

    }

    @Override
    public void tourParTour() {

    }

    @Override
    public void terminerCombat() {

    }
}