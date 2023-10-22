public class B4IsPrime extends ConsoleProgram { 

    /**
     * Description: Gets the user input for a number and outputs whether it is a prime or composite number
     * 
     * @author: Joshua Yin
     */

     public void run() {
        
        // Gets user input for the number they want to know whether is prime or not
        int myNumber = readInt("Enter a number: ");
        // Number of divisors is 0
        int numberOfDivisors = 0;

        // Loops through all natural numbers smaller than myNumber
        for (int divisor = 1; divisor <= myNumber; divisor ++) {
            // If the remainder of myNumber / divisor equals to zero, then the numberOfDivisors increases by 1
            if(myNumber % divisor == 0) {
                numberOfDivisors ++;
            }
        }
        
        // If the number of divisors is 1 then it is neither prime or composite
        if (numberOfDivisors == 1) {
            System.out.println("Neither");
        }
        // If the number of divisors is 2 then it is prime
        else if (numberOfDivisors == 2) {
            System.out.println("Prime Number");
        }
        // If the number of divisors is more than 2 then it is composite
        else {
            System.out.println("Composite Number");
        }
     }
}
