/*
 * Name: Salah Mahmoud 
 * Date 2/14/2024
 * Description: Create rock paper scissors game
 */

import java.util.Random;
import java.util.Scanner;

public class rpsGame_group1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Game " + i);
            String p1choice, p2choice;

            // Call userChoice- pass the objects through the methods
            p1choice = userChoice(scanner);
         
            p2choice = compChoice(random);

            System.out.println("Player 1 choice is " + p1choice);
            System.out.println("Player 2 choice is " + p2choice);
            System.out.println("The result of the game is " + winner(p1choice, p2choice));
           //Used to make code more readable (blank line)
            System.out.println();
        }

        //scanner.close(); p
    }

    public static String userChoice(Scanner scanner) {
        String uChoice;

        System.out.print("Enter rock, paper, or scissors: ");
      
      
        uChoice = scanner.next();

        return uChoice; 
    }

    public static String compChoice(Random random) {
        String scChoice; 
       
       
        int cChoice = random.nextInt(3);

        if (cChoice == 0) {
            scChoice = "rock";
        } else if (cChoice == 1) {
            scChoice = "paper";
        } else {
           
           
            scChoice = "scissors"; 
        }
     
        
        return scChoice;
    }

    public static String winner(String p1c, String p2c) {
        String won;

        // Check if player 1 wins
        if (p1c.equals("rock") & p2c.equals("scissors")||
            p1c.equals("scissors") & p2c.equals("paper") ||
            p1c.equals("paper") & p2c.equals("rock")) {
            won = "Player 1 wins";
        }
        // Check if there is a tie
        else if (p1c.equals(p2c)) {
            won = "Tie"; 
        }
        // Player 2 wins
        else {
            won = "Player 2 wins";
        }

        return won; 
    }
}