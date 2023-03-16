//To do - Reverse a string
import java.util.Scanner;

public class ReversedSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
         // Prompt the user to enter a sentence to reverse
            System.out.print("Enter a sentence to reverse or type 'exit' to quit: ");
            String inputSentence = scanner.nextLine();
         // Exit the program if the user types 'exit'
            if (inputSentence.equalsIgnoreCase("exit")) { 
                break;
            }

         // .split() method transtorms the string into an array of words
            String[] words = inputSentence.split(" ");
            String reversedSentence = "";
         // for loop iterates in reverse(-1) order the array word with the words from the inputSentence splited
            for (int i = words.length - 1; i >= 0; i--) {
                reversedSentence += words[i] + " ";
            }
            System.out.println("Reversed sentence: " + reversedSentence.trim());
        }

        scanner.close();
    }
}
