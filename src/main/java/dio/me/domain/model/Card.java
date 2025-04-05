package dio.me.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String rarity;
    private int level;

    @Max(1000)
    private int demage;

    @Max(5000)
    private int hitpoint;

    @Max(10)
    private int elixirCost;

    @ManyToOne
    @JoinColumn(name = "deck_id")
    private Deck deck;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getRarity() {return rarity;}

    public void setRarity(String rarity) {this.rarity = rarity;}

    public int getLevel() {return level;}

    public void setLevel(int level) {this.level = level;}

    public int getDemage() {return demage;}

    public void setDemage(int demage) {this.demage = demage;}

    public int getHitpoint() {return hitpoint;}

    public void setHitpoint(int hitpoint) {this.hitpoint = hitpoint;}

    public int getElixirCost() {return elixirCost;}

    public void setElixirCost(int elixirCost) {this.elixirCost = elixirCost;}

}
