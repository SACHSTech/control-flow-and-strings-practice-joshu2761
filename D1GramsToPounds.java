public class D1GramsToPounds extends ConsoleProgram {

    /**
     * Description: Writes a program that outputs a formatted table that shows a conversion from grams to pounds from 100 to 1000 grams.
     * 
     * @author: Joshua Yin
     */

     public void run() {

        System.out.printf("%6s", "Grams");
        System.out.printf("%10s\n", "Pounds");
        System.out.println("--------------------");

        for (int grams = 100; grams <= 1000; grams += 100) {
            System.out.printf("%6d", grams);
            double lbs = grams / 453.6;
            System.out.printf("%10.4f\n", lbs);
        }

     }
}