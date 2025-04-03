package dio.me.domain.model;

import jakarta.persistence.*;
import java.util.List;

@Entity(name = "tb_deck")
public class Deck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Card> card;

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public List<Card> getCard() {return card;}

    public void setCard(List<Card> card) {this.card = card;}
}