package com.SimonGForsgren.oop.Logic;

import com.SimonGForsgren.oop.Entities.Enemies.Ghoul;
import com.SimonGForsgren.oop.Entities.Player;
import java.util.Random;
import java.util.Scanner;

public class InCombat {

    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    public void Fight(Ghoul ghoul, Player player) {
        System.out.println("You encounter a Ghoul!");

        int choice;

        while (ghoul.hp >= 1 && player.hp >= 1) {
            System.out.println("(1) Attack!");
            System.out.println("(2) Defend!");
            System.out.println("(3) Escape!");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    int playerDamage = player.attack();
                    ghoul.hp -= playerDamage;
                    System.out.println("You dealt " + playerDamage + " damage to the " + ghoul.name + "!");

                    if (ghoul.hp <= 0) {
                        System.out.println("The " + ghoul.name + " has been defeated");
                        player.xp += ghoul.xp;
                        ghoulDied(ghoul);
                        break;
                    }

                    int ghoulDamage = ghoul.attack();
                    player.hp -= ghoulDamage;
                    System.out.println("The " + ghoul.name + " dealt " + ghoulDamage + " damage to you!");
                    break;

                case 2:
                    int DamageDefend = ghoul.attack();
                    int DamageDefended = player.defend(DamageDefend);
                    System.out.println("You defended and took " + DamageDefended + " damage from the " + ghoul.name + "!");
                    break;

                case 3:
                    if (attemptEscape()) {
                        System.out.println("You successfully escaped!");
                        return;
                    } else {
                        System.out.println("Failed to escape! The " + ghoul.name + " attacks you.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }

        if (player.hp <= 0) {
            System.out.println("You were killed, you were unable to escape the Dungeon and your corpse will forever remain there.");
            BasicLogic.PlayerDied();
        }
    }
    private void ghoulDied(Ghoul ghoul) {
        System.out.println("You gained " + ghoul.xp + " XP from defeating the " + ghoul.name + "!");
    }
    private boolean attemptEscape() {
        return random.nextBoolean();
    }
}