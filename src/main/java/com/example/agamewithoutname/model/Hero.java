package com.example.agamewithoutname.model;

import javax.persistence.*;

@Entity
public class Hero {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hero_id_seq")
    @SequenceGenerator(name = "hero_id_seq", allocationSize = 1)

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
