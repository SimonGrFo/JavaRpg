package com.SimonGForsgren.oop.Entities;

public abstract class Characters {
    //Characters class that both Player and Enemy inherit.


    //variable / attributes all Characters have
    public String name;
    public int maxHp;
    public int hp;
    public static int xp;

    //Constructor for character
    public Characters(String name, int maxHp, int xp){
        this.name = name;
        this.maxHp = maxHp;
        this.xp = xp;
        this.hp = maxHp;
    }

    //method for attack and defense that every character has
    public abstract int attack();
    public abstract int defend();

    public int defend(int ghoulDamageDefend) {
        return ghoulDamageDefend;
    }
}