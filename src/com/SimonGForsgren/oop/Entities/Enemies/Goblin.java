package com.SimonGForsgren.oop.Entities.Enemies;

import com.SimonGForsgren.oop.Entities.Characters;

public class Goblin extends Characters {
    public Goblin(String Goblin, int maxHp, int xp) {
        super(Goblin, 20, 40);
    }
    @Override
    public int attack() {
        return 6;
    }
    @Override
    public int defend() {
        return 6;
    }
}