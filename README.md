# Application Pokemon en Java

Jeu de combat de Pokemon version deeeev
Deux dresseurs s'affrontent dans une arène jusqu'à que mort s'en suive ! 💀💀💀💀💀


## Prérequis

- **Java 21.0**

## Diagramme de classes

```plantuml
@startuml

Class Dresseur implements Arene{
nom : String
inventaire : Inventaire
équipe : int
+ utiliserInventaire()
+ getPokemon(): public
+ changerPokemon() : public
}

Class Pokemon extends Type, Attaque {
nom: String
hPMax : int
hPRestant : int
List<Attaque> attaques
+ Attaquer() : public
}

Class Type {
nom : String
+ ComportementFeu() : public
+ ComportementEau() : public
+ ComportementVol() : public
+ ComportementCodeur() : public
}

Class Attaque extends Type {
nom : String
puissanceMax : int
puisanceMin : int

}

Interface Arene{
+ debuterCombat()
+ tourParTour()
+ terminerCombat() 
}



Class Inventaire {
nbPokemon : int
nbPokeball : int
+ voirHpRestantPokemons : public
}

Dresseur o-- Pokemon
Dresseur o-- Inventaire

@enduml
```

## Usage
L'application est en cours de construction. :poop: :construction:

## Contributions :busts_in_silhouette:

- Amine :busts_in_silhouette:
- Justine :busts_in_silhouette:
- Gaëtan :busts_in_silhouette:
