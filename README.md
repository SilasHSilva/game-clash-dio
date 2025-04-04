# API CLash Royale

## Diagrama de Classes

```mermaid
classDiagram
    class User {
        -String name
        -Deck deck
        -Level level
    }

    class Deck {
        -Card[] cards
        -String name
    }

    class Card {
        -String name
        -String rarity
        -Number level
        -Number damage
        -Number hitpoints
        -Number elixirCost
    }

    class Level {
        -Number levelNumber
        -Number experienceRequired
        -String description
    }

    User "1" *-- "1" Deck
    User "N" *-- "N" Level
    Deck "1" *-- "N" Card
```

# Example JSON
```
{
  "name": "JogadorPro",
  "level": {
    "levelNumber": 5,
    "experienceRequired": 1000,
    "description": "Guerreiro Mestre"
  },
  "deck": {
    "name": "Deck Principal",
    "cards": [
      {
        "name": "Arqueira",
        "rarity": "Comum",
        "level": 8,
        "damage": 100,
        "hitpoints": 300,
        "elixirCost": 3
      },
      {
        "name": "Gigante",
        "rarity": "Raro",
        "level": 5,
        "damage": 250,
        "hitpoints": 2000,
        "elixirCost": 5
      },
      {
        "name": "Príncipe",
        "rarity": "Épico",
        "level": 4,
        "damage": 300,
        "hitpoints": 1500,
        "elixirCost": 5
      }
    ]
  }
}
```
