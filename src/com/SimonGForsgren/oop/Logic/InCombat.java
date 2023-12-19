package com.SimonGForsgren.oop.Logic;
import com.SimonGForsgren.oop.Entities.Enemies.Ghoul;
import com.SimonGForsgren.oop.Entities.Player;
import com.SimonGForsgren.oop.Logic.BasicLogic;
import java.util.Random;
import java.util.Scanner;
import static com.SimonGForsgren.oop.Logic.BasicLogic.PlayerDied;

public class InCombat {

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

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

                    // Check if the Ghoul is defeated
                    if (ghoul.hp <= 0) {
                        System.out.println("The " + ghoul.name + " has been defeated");
                        player.xp + Ghoul.xp;

                        break;
                    }

                    // Implement Ghoul's attack here
                    // int ghoulDamage = ghoul.attack(); // You need to implement this method in your Ghoul class
                    // player.hp -= ghoulDamage;
                    // System.out.println("The " + ghoul.name + " dealt " + ghoulDamage + " damage to you!");

                    break;
                // Implement cases 2 (Defend) and 3 (Escape) here
                case 2:
                    // Implement logic for Defend
                    break;
                case 3:
                    // Implement logic for Escape
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }

        // TODO: Check if the player's HP is <= 0 and call PlayerDied() if needed
    }
