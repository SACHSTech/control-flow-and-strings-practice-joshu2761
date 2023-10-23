public class C1BackToBack extends ConsoleProgram {

    /**
     * Description: Given a string, take the last character and print a new string with the last character added at the front and back
     * 
     * @author: Joshua Yin
     */

     public void run() {

        // Gets the user input for their word
        String word = readLine("Enter your word: ");
        // Gets the last character of the word
        char lastCharacter = word.charAt(word.length() - 1);
        // Prints out the last character + the word + the last character
        System.out.printf(lastCharacter + "%s" + lastCharacter, word);
     }
}