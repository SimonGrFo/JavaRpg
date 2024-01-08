package com.SimonGForsgren.oop.Logic;

import com.SimonGForsgren.oop.Entities.Characters;
import com.SimonGForsgren.oop.Entities.Enemies.Ghoul;
import com.SimonGForsgren.oop.Entities.Player;
import java.util.Random;
import java.util.Scanner;

public class InCombat {

    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    public void Fight(Ghoul ghoul, Player player) {
        System.out.println("You encounter a Ghoul!");

        while (ghoul.hp >= 1 && player.hp >= 1) {
            System.out.println("(1) Attack!");
            System.out.println("(2) Defend!");
            System.out.println("(3) Escape!");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    int playerDamage = player.attack();
                    ghoul.hp -= playerDamage;
                    System.out.println("You dealt " + playerDamage + " damage to the " + ghoul.name + "!");
                    // ...

                case 2:
                    int ghoulDamageDefend = ghoul.attack();
                    int defendedDamageDefend = player.defend();
                    System.out.println("You defended and took " + defendedDamageDefend + " damage from the " + ghoul.name + "!");

                case 3:
                    // Implement logic for Escape
                    if (attemptEscape()) {
                        System.out.println("You successfully escaped!");
                        return;  // Break out of the while loop and end the fight
                    } else {
                        System.out.println("Failed to escape! The " + ghoul.name + " attacks you.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }

        // TODO: Check if the player's HP is <= 0 and call PlayerDied() if needed
    }

    private boolean attemptEscape() {
        return random.nextBoolean();  // Adjust the probability as needed
    }
}