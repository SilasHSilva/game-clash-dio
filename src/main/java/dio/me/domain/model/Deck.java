package dio.me.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "tb_deck")
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Card> cards = new ArrayList<>();

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public List<Card> getCards() {return cards;}
}
