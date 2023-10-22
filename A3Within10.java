public class A3Within10 extends ConsoleProgram {

    /**
     * Description: Given 2 int values via user input, output whichever value is nearest to the value 10, or output 0 in the event of a tie.
     * 
     * @author: Joshua Yin
     */

    public void run() { 

        // Takes in the user input for the 2 numbers
        int num1 = readInt("Enter the value of the first number: ");
        int num2 = readInt("Enter the value of the second number: ");

        // If the absolute value of num1 - 10 is less than the absolute value of num2 - 10, then it prints num1
        if (Math.abs(num1 - 10) < Math.abs(num2 - 10)) {
            System.out.println(num1);
        }
        // If the absolute value of num2 - 10 is less than the absolute value of num1 - 10, then it prints num2
        else if (Math.abs(num2 - 10) < Math.abs(num1 - 10)) {
            System.out.println(num2);
        }
        // Otherwise it prints 0
        else {
            System.out.println(0);
        }
    }
}