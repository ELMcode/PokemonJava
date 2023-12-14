package pokemonapp.model;

public class Attaque extends Type{
    private String nom;
    private int puissanceMax;
    private int puissanceMin;

    public Attaque(String feu, String vol, String eau, String codeur) {
        super(feu, vol, eau, codeur);
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuissanceMax() {
        return puissanceMax;
    }

    public void setPuissanceMax(int puissanceMax) {
        this.puissanceMax = puissanceMax;
    }

    public int getPuissanceMin() {
        return puissanceMin;
    }

    public void setPuissanceMin(int puissanceMin) {
        this.puissanceMin = puissanceMin;
    }
}
