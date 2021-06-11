package com.example.agamewithoutname.model;

import javax.persistence.*;

@Entity
public class DecorElement {
    @Id
    // Gnération automatique des Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "decorElement_id_seq")
    @SequenceGenerator(name = "decorElement_id_seq", allocationSize = 1)
    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
