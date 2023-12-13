package com.SimonGForsgren.oop.Entities;

public abstract class Characters {
 //Characters class that both Player and Enemy inherit.


    //variable / attributes all Characters have
    public static String name;
    public int maxHp, hp, xp;

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
}