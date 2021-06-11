package com.example.agamewithoutname.model;

import javax.persistence.*;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "game_id_seq")
    @SequenceGenerator(name = "game_id_seq", allocationSize = 1)

    private int id;

    @ManyToOne
    @JoinColumn(name="appuser")
    private User user;

    @ManyToOne
    private Weapon weapon;

    @ManyToOne
    private DefenseEquipment defenseEquipment;

    private int points;

    private int lives;

    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public DefenseEquipment getDefenseEquipment() {
        return defenseEquipment;
    }

    public int getPoints() {
        return points;
    }

    public int getLives() {
        return lives;
    }
}
