package com.example.agamewithoutname.model;

import javax.persistence.*;

@Table
@Entity
public class GameUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "game_user_id_seq")
    @SequenceGenerator(name = "game_user_id_seq", allocationSize = 1)
    private int id;

    private String name;

    private int level;

    @ManyToOne
    private Hero hero;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public Hero getHero() {
        return hero;
    }
}
