import java.util.Random;

public class B1DiceGame extends ConsoleProgram{

    /**
     * Description: Simulates rolling 100 pairs dice and based on the sum of the pair, it outputs a message. 
     * 
     * @author: Joshua Yin
     */

     public void run() {

        // Declares new random variable
        Random diceRandom = new Random();

        // For loop that repeats 100 times
        for (int i = 0; i < 100; i++) {
            
            // Gets 2 random variables from dice1 and dice2
            int dice1 = diceRandom.nextInt(6) + 1;
            int dice2 = diceRandom.nextInt(6) + 1; 

            // If the pair adds up to 2 then it prints "snake eyes!"
            if (dice1 + dice2 == 2) {
                System.out.println("snake eyes!");
            }
            // If the pair adds up to 7 then it prints "lucky seven!"
            else if (dice1 + dice2 == 7) {
                System.out.println("lucky seven!");
            }
            // Otherwise it prints nothing
            else {
                System.out.println();
            }
        }
     }
}