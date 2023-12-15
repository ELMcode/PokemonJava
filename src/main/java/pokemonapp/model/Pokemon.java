package pokemonapp.model;

import java.util.ArrayList;
import java.util.List;

public class Pokemon extends Attaque {
    private String nom;
    private int hpMax;
    private int hpRestant;

     private List<Attaque> attaques;

     private Type type;

    public Pokemon(String nom,
                   String nomAttaque,
                   int puissanceMax,
                   int puissanceMin,
                   String nomPokemon,
                   int hpMax,
                   int hpRestant,
                   List<Attaque> attaques,
                   Type type
    ) {
        super(
                nom,
                nomAttaque,
                puissanceMax,
                puissanceMin);
        this.nom = nomPokemon;
        this.hpMax = hpMax;
        this.hpRestant = hpRestant;
        this.attaques = attaques;
        this.type = type;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void setNom(String nom) {
        this.nom = nom;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
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

    public List<Attaque> getAttaques() {
        return attaques;
    }

    public void setAttaques(List<Attaque> attaques) {
        this.attaques = attaques;
    }
    public void attaquerCible(){

    }
}
