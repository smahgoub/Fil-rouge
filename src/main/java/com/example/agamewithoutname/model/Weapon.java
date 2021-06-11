package com.example.agamewithoutname.model;

import javax.persistence.*;

@Entity
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "weapon_id_seq")
    @SequenceGenerator(name = "weapon_id_seq", allocationSize = 1)
    private int id;

    private String name;

    private int points;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}
