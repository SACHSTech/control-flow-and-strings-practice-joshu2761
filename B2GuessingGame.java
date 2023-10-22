import java.util.Random;

public class B2GuessingGame extends ConsoleProgram { 
    
    /**
     * Description:
     * 
     * @author: Joshua Yin
     */

     public void run() {

        // Declares new random variable
        Random guessRandom = new Random();

        // Gets a secret number between 0 and 100
        int secretNumber = guessRandom.nextInt(100);
        // You are given 5 tries
        int tries = 5;

        // Repeats while tries are greater than 0
        while (tries > 0) {
            
            // Gets the user input for their guess on what the secret number is
            int guessNumber = readInt("Enter your guess for the secret number: ");

            if (guessNumber > secretNumber) {
                // If the guessed number is greater than the secret number then it prints this
                System.out.println("Too high! You have " + (tries - 1) + " tries left");
                // Subtracts the number of tries left by 1
                tries--;
            }
            else if (guessNumber < secretNumber) {
                // If the guessed number is less than the secret number then it prints this
                System.out.println("Too low! You have " + (tries - 1) + " tries left");
                // Subtracts the number of tries by 1
                tries--;
            }
            else { 
                // If the guessed number is equal to the secret number then it prints congradulations and breaks. 
                System.out.println("Congradulations!");
                break;
            }
        }

        //If the tries are equal to 0 then it prints this: 
        if (tries == 0) {
            System.out.println("You used up all your tries. Better luck next time!");
        }
     }
}