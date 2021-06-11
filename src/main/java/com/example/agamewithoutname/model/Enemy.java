package com.example.agamewithoutname.model;

import javax.persistence.*;

@Entity
public class Enemy {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enemy_id_seq")
    @SequenceGenerator(name = "enemy_id_seq", allocationSize = 1)

    private int id;

    private String name;

    private String type;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
