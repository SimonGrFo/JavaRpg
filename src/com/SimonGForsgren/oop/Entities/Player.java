package com.SimonGForsgren.oop.Entities;

public class Player extends Characters {
    public Player(String name, int maxHp, int xp) {
        super(name, 100, 0);
    }

    public Player(String name) {
        super(name, 100, 0);
    }


    //TODO more stuff here

    @Override
    public int attack() {
        return (int) (xp/10 + 10);
    }

    @Override
    public int defend() {
        return (int) (xp/10 + 10);
    }
}
