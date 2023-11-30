package com.SimonGForsgren.oop.Logic;
import java.util.Scanner;

public class BasicLogic {
    public static boolean isRunning; //while True, game will run






    public static void PlayerDied(){
        isRunning = false;
    }

    public static void printMenu() {
        System.out.println("Choose an action");
        System.out.println("(1) FIGHT!");       //option 1 to Fight an enemy
        System.out.println("(2) STATUS");       //option 2 to Check player status
        System.out.println("(3) QUIT GAME");    //option 3 to Exit the game
    }

    public static void GameLoop(){
        Scanner scanner = new Scanner(System.in);

        while(isRunning){
            printMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    // TODO Add fight logic here
                    break;
                case 2:
                    // TODO Add status check logic here
                    break;
                case 3:
                    System.out.println("Exiting");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

}
