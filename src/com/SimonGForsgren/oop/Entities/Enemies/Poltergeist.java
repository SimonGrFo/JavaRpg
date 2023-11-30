package com.SimonGForsgren.oop.Entities.Enemies;

import com.SimonGForsgren.oop.Entities.Characters;

public class Poltergeist extends Characters {
    public Poltergeist(String name, int maxHp, int xp) {
        super(name, maxHp, xp);
    }

    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }
}
