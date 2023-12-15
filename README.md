# Application Pokemon en Java

Jeu de combat de Pokemon, 2 dresseurs s'affrontent dans une arène jusqu'à que mort s'en suive !


## Prérequis

- **Java 21.0**

## Diagramme de classes

## Usage

## Contributions

- Amine :busts_in_silhouette:
- Justine :busts_in_silhouette:
- Gaëtan :busts_in_silhouette:


```plantuml
@startuml

Class Dresseur implements Arene{
- nom : String
+ utiliserInventaire()
+ getPokemon(): public
+ changerPokemon() : public
}

Class Pokemon extends Type, Attaque {
- nom: String
- hpMax : int
- hpRestant: int
+ AttaquerCible() : public
}

Class Type {
- feu : String
- vol : String
- eau : String
- normal : String
- codeur : String
+ ComportementFeu() : public
+ ComportementEau() : public
+ ComportementVol() : public
+ ComportementCodeur() : public
}

Class Attaque extends Type {
- nom : String
- puissanceMax : int
- puisanceMin : int

}

Interface Arene{
+ debuterCombat()
+ tourParTour()
+ terminerCombat() 
}



Class Inventaire {
- nbPokemon : int
- nbPokeball : int
+ voirHpRestantPokemons : public
}

Dresseur o-- Pokemon
Dresseur o-- Inventaire

@enduml
```