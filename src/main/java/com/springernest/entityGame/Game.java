package com.springernest.entityGame;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Entity
@NoArgsConstructor
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String category;

    @Column
    private Integer estimatedHours;

    @Column
    private Integer minAge;

    @Column
    private LocalDate releaseDate;

    public Game(String title, String category, Integer estimatedHours, Integer minAge, LocalDate releaseDate) {
        this.title = title;
        this.category = category;
        this.estimatedHours = estimatedHours;
        this.minAge = minAge;
        this.releaseDate = releaseDate;
    }
}
