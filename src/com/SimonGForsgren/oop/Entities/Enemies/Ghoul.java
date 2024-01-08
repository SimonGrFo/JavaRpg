package com.SimonGForsgren.oop.Entities.Enemies;

import com.SimonGForsgren.oop.Entities.Characters;

public class Ghoul extends Characters {
    public int xp;  // Change to instance variable

    public Ghoul(String ghoul, int maxHp, int xp) {
        super(ghoul, 30, maxHp, 1);
        this.xp = xp;  // Initialize instance variable
    }

    @Override
    public int attack() {
        return 5;
    }

    @Override
    public int defend() {
        return 5;
    }
}
