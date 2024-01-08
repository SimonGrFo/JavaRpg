package com.SimonGForsgren.oop.Entities.Enemies;

import com.SimonGForsgren.oop.Entities.Characters;

public class Poltergeist extends Characters {
    public Poltergeist(String Poltergeist, int maxHp, int xp) {
        super(Poltergeist, 50, 50, 1);
    }
    @Override
    public int attack() {
        return 7;
    }
    @Override
    public int defend() {
        return 7;
    }
}