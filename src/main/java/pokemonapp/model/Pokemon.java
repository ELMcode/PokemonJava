package pokemonapp.model;

public class Pokemon implements Type, Attaque {
    private String nom;
    private int hpMax;
    private int hpRestant;

    public Pokemon(String nom, int hpMax, int hpNow) {
        super();
        this.nom = nom;
        this.hpMax = hpMax;
        this.hpRestant = hpNow;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public int getHpRestant() {
        return hpRestant;
    }

    public void setHpRestant(int hpRestant) {
        this.hpRestant = hpRestant;
    }

    public void attaquerCible(){

    }
}
