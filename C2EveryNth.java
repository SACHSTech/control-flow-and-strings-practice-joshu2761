public class C2EveryNth extends ConsoleProgram {

    /**
     * Description: Given a non-empty string and an int N, return the string made starting with character 0, and then every Nth char of the string.
     * 
     * @author: Joshua Yin
     */

     public void run() {
        
        // Gets the user input for their word
        String word = readLine("Enter your word: ");
        // Gets the user input for their N value
        int nValue = readInt("What is the value of N: ");

        for (int i = 0; i < word.length(); i += nValue) {
            System.out.print(word.charAt(i));
        }
    }
}