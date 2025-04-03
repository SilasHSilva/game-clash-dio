package dio.me.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;

@Entity(name = "tb_level")
public class Level {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @Max(9000)
    private int trophy;
    @Max(70)
    private int levelNumber;

    public Long getId() {return id;}

    public void setId(Long id) { this.id = id; }

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public int getTrophy() {return trophy;}

    public void setTrophy(int trophy) {this.trophy = trophy;}

    public int getLevelNumber() {return levelNumber;}

    public void setLevelNumber(int levelNumber) {this.levelNumber = levelNumber;}
}
