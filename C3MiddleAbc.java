public class C3MiddleAbc extends ConsoleProgram {

    /**
     * Description: Given a string, prints if "abc" appears in the middle of the string
     * 
     * @author: Joshua Yin
     */

     public void run() {
        
        // Gets the user input for the string
        String myString = readLine("Enter a word: ");

        // Splits the string along "abc"
        String[] stringSplit = myString.split("abc");
        // Gets the length of before abc and after
        int beforeAbc = stringSplit[0].length();
        int afterAbc = stringSplit[1].length();

        // If the absolute value of beforeAbc - afterAbc <= 1 then it prints true
        if (Math.abs(beforeAbc - afterAbc) <= 1) {
            System.out.println(true);
        }
        // Otherwise it prints false
        else {
            System.out.println(false);
        }
    }
}