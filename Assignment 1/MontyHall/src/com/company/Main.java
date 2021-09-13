package com.company;

import java.util.Scanner;

public class Main {
    // Declaring "doors" for the whole main class
    static Door red = new Door("Left", "Red");
    static Door green = new Door("Center", "Green");
    static Door blue = new Door("Right", "Blue");

    // Declaring scanner for the user input
    static Scanner input = new Scanner(System.in);

    // Main program
    public static void main(String[] args) {
        // Initializing the game
        Game game = new Game(red, green, blue);

        //Declaring variables
        String keepPlaying;
        String keepChoice;
        boolean play = true;

        Door chosenDoor;
        Door winningDoor;
        Door loosingDoor;
        Door lastDoor;

        System.out.printf("Welcome to Monty Hall Game!%n" +
                "There are three doors: Red, Green, and Blue.%n" +
                "One door has a prize behind it, make your pick(r, g, b): ");

        // Main play loop
        while(play){
            // Predetermining what is behind doors and which door to open
            chosenDoor = myMethod();    // Player's choice
            winningDoor = game.Prize();
            loosingDoor = game.openDoor(winningDoor, chosenDoor);
            lastDoor = game.lastDoor(loosingDoor, chosenDoor);

            System.out.printf("You chose the %s door. ", chosenDoor.getColor());
            System.out.printf("There is no prize behind the %s %s door. %n", loosingDoor.getName(), loosingDoor.getColor());

            System.out.print("Would you like to keep your choice? (yes/no): ");
            keepChoice = input.nextLine();  // Choice if the player wants to keep or switch the door

            if (keepChoice.equalsIgnoreCase("no")) {
                System.out.printf("You switched to the remaining %s %s door %n", lastDoor.getColor(), lastDoor.getName());
                chosenDoor = lastDoor;  // Switching to the remaining door
            }

            // Calculating the win
            if (chosenDoor.equals(winningDoor)) {
                System.out.println("You won!");
            } else {
                System.out.println("You lost!");
            }

            System.out.printf("Prize was behind the %s %s door %n %n", winningDoor.getColor(), winningDoor.getName());

            // Asking the player if they want to continue the game
            System.out.print("Would you like to continue? (yes/no): ");
            keepPlaying = input.nextLine();

            if(keepPlaying.equalsIgnoreCase("yes"))  play = true;
            else break;     // Exit on player's choice

            System.out.print("Choose a door (r, g, b): ");
        }

    // Method for player's input (name coule be better)
    public static Door myMethod(){
        String choice;
        Door chosenDoor;

        choice = input.nextLine();

        chosenDoor = switch (choice) {
            case "r" -> red;
            case "g" -> green;
            case "b" -> blue;
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };

        return chosenDoor;
    }
}


/*Left Center and Right door
* a class for a door
* a class for a game that takes in 3 doors
* place a prize behind a door
* make a player choose a door
* don't open that door
* open a door without a prize
* make a player choose between their current door and the unopened one
* reveal what is behind the door*/

/**/
