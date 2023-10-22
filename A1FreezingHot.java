public class A1FreezingHot extends ConsoleProgram {

    /**
     * Description: Given two temperatures via user input, output true if one is less than 0 and the other is greater than 100.
     * 
     * @author: Joshua Yin
     */

    public void run() {

        // Takes in user input for value 1 and 2
        int value1 = readInt("Enter value 1: ");
        int value2 = readInt("Enter value 2: ");

        // If value 1 or value 2 is greater than 100 and value 1 or value is less than 100, it will print true
        if ((value1 > 100 || value2 > 100) && (value1 < 0 || value2 < 0)){
            System.out.println(true);
        }
        // Otherwise it prints false
        else {
            System.out.println(false);
        }
    }
}