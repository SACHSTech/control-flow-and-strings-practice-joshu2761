public class A2HasTeen extends ConsoleProgram {

    /**
     * Description: Given 3 int values from user input, output true or false if 1 or more of them are teen.
     * 
     * @author: Joshua Yin
     */
    
    public void run() {

        // Gets the user input for the 3 numbers.
        int num1 = readInt("Enter the first number: ");
        int num2 = readInt("Enter the second number: ");
        int num3 = readInt("Enter the third number: ");

        // Determines whether the numbers are between 13 or 19. 
        boolean isTeen1 = num1 >= 13 && num1 <= 19;
        boolean isTeen2 = num2 >= 13 && num2 <= 19;
        boolean isTeen3 = num3 >= 13 && num3 <= 19;

        // If one or more of the values are teen then it prints true.
        if (isTeen1 || isTeen2 || isTeen3) {
            System.out.println(true);
        }
        // Otherwise it prints false.
        else {
            System.out.println(false);
        }
    }
} 