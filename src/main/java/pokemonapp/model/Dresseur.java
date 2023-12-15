package pokemonapp.model;

public class Dresseur implements Arene {

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

    public void getPokemon(){

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
