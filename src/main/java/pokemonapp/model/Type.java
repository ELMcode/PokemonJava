package pokemonapp.model;

public class Type {
    public String feu;
    public String vol;
    public String eau;
    public String codeur;

    public Type(String feu, String vol, String eau, String codeur) {
        this.feu = feu;
        this.vol = vol;
        this.eau = eau;
        this.codeur = codeur;
    }

    public String getFeu() {
        return feu;
    }

    public void setFeu(String feu) {
        this.feu = feu;
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    public String getEau() {
        return eau;
    }

    public void setEau(String eau) {
        this.eau = eau;
    }

    public String getCodeur() {
        return codeur;
    }

    public void setCodeur(String codeur) {
        this.codeur = codeur;
    }
}
