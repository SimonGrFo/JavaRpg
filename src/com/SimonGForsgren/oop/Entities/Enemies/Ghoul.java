package com.SimonGForsgren.oop.Entities.Enemies;

import com.SimonGForsgren.oop.Entities.Characters;

public class Ghoul extends Characters {
    public Ghoul(String Ghoul, int maxHp, int xp) {
        super(Ghoul, 30, 10);
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