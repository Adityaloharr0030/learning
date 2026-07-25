package game;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        // Initialize Scanner for user input and Random for number generation
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Set the range for the random number (1 to 100)
        int minRange = 1;
        int maxRange = 10;
        int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;

        int numberOfTries = 0;
        int userGuess = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I have selected a number between " + minRange + " and " + maxRange + ".");
        System.out.println("Can you guess what it is?");

        // Game loop
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");

            // Check if the input is actually an integer
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                numberOfTries++;

                if (userGuess < minRange || userGuess > maxRange) {
                    System.out.println("Please guess a number within the valid range (" + minRange + " to " + maxRange + ").");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the number " + numberToGuess + " correctly.");
                    System.out.println("It took you " + numberOfTries + " tries.");
                }
            } else {
                // Handle invalid (non-integer) input
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next(); // Clear the invalid input from the scanner
            }
        }

        // Close the scanner to prevent memory leaks
        scanner.close();
        System.out.println("Thanks for playing!");
    }
}