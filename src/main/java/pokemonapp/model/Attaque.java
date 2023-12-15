package pokemonapp.model;

public class Attaque extends Type{
    private String nom;
    private int puissanceMax;
    private int puissanceMin;

    public Attaque(String nom,
                   String nomAttaque,
                   int puissanceMax,
                   int puissanceMin
    ) {
        super(nom);
        this.nom = nomAttaque;
        this.puissanceMax = puissanceMax;
        this.puissanceMin = puissanceMin;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
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
