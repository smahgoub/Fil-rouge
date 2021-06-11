package com.example.agamewithoutname.model;

import javax.persistence.*;

@Entity
public class DefenseEquipment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "defenseEquipment_id_seq")
    @SequenceGenerator(name = "defenseEquipment_id_seq", allocationSize = 1)
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
