package com.SimonGForsgren.oop.Entities;

import com.SimonGForsgren.oop.Entities.Player;
public class Status {
    public static void displayPlayerStatus(Player player) {
        System.out.println("Player Name: " + player.name);
        System.out.println("HP: " + player.hp + "/" + player.maxHp);
        System.out.println("XP: " + player.xp);


        //TODO more (stats and stuff)
    }
}