package pokemonapp.model;

public  class Attaque {
    private String nom;
    private int puissanceMax;
    private int puissanceMin;

    public Attaque(String nom, int puissanceMax, int puissanceMin) {
        this.nom = nom;
        this.puissanceMax = puissanceMax;
        this.puissanceMin = puissanceMin;
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
