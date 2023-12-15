package pokemonapp.model;

public class Dresseur implements Arene {

    private String nom;

    private Inventaire inventaire;

    public Dresseur(String nom, Inventaire inventaire) {
        this.nom = nom;
        this.inventaire = inventaire;
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

    public void utiliserInventaire(){

    }

    public void getPokemon(){

    }

    public void changerPokemonPendantCombat(){

    }

}
