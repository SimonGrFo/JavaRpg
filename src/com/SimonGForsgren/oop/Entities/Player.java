package com.SimonGForsgren.oop.Entities;

public class Player extends Characters {
    public Player(String name, int maxHp, int xp, int level) {
        super(name, 100, 0, 0);
    }

    public Player(String name) {
        super(name, 100, 0, 0);
    }

    public void levelUp() {

        while (xp >= 30) {
            xp -= 30; // Deduct XP for the next level
            increaseLevel();
            System.out.println(name + " leveled up to level " + level);
        }
    }

    private void increaseLevel() {
        level++;
    }


    @Override
    public int attack() {
        return (int) (xp/10 + 10);
    }

    @Override
    public int defend() {
        return (int) (xp/10 + 10);
    }
}