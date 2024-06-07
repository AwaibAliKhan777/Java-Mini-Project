import java.util.Scanner; // Import the Scanner class to read user input

public class Mini {
    public static void main(String[] args) {
        // MINI PROJECT

        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Variable to store the user's guess
        int username;

        // Generate a random number between 0 and 99 (inclusive)
        int mynumber = (int)(Math.random() * 100);

        // Loop until the user guesses the correct number
        do {
            // Prompt the user to guess the number
            System.out.println("Guess my number from 1-100: ");

            // Read the user's guess
            username = sc.nextInt();

            // Check if the user's guess is correct
            if (username == mynumber) {
                // If the guess is correct, print a success message and exit the loop
                System.out.println("Waooo, correct number!");
                break;
            } else if (username > mynumber) {
                // If the guess is higher than the random number, print a hint
                System.out.println("Your guessing number is large");
            } else if (username < mynumber) {
                // If the guess is lower than the random number, print a hint
                System.out.println("Your guessing number is small");
            } else {
                // This else clause is actually unreachable, but kept for completion
                System.out.println("Try next time");
            }
        } while (username >= 0); // Continue the loop while the guess is non-negative

        // After the loop ends, print the actual number
        System.out.println("My number was: " + mynumber);

        // Close the Scanner object to free up resources
        sc.close();
    }
}
