import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();
        // Generate a number between 1 and 100
        int secretNumber = random.nextInt(100) + 1;
        
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        // Loop until correct guess
        while (guess != secretNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " tries!");
            }
        }
        
        scanner.close();
    }
}
