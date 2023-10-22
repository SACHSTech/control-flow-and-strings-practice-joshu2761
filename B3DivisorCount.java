public class B3DivisorCount extends ConsoleProgram {

    /**
     * Description: Given a user input, outputs the number of divisors that it has
     * 
     * @author: Joshua Yin
     */

     public void run() {

        // Gets user input for the number they want to know the number of divisors of
        int myNumber = readInt("Enter a number: ");
        // Number of divisors is 0
        int numberOfDivisors = 0;

        // Loops through all natural numbers smaller than myNumber
        for (int divisor = 1; divisor <= myNumber; divisor ++) {
            // If the remainder of myNumber / divisor equals to zero, then the numberOfDivisors increases by 1
            if (myNumber % divisor == 0) {
                numberOfDivisors ++;
            }
        }
        // Prints the final result of the number of divisors
        System.out.println(numberOfDivisors);
     }
}