// User story 1 : Reverse the letters from a word keeping the Capital Letter in the right place
import java.util.Scanner;

public class Analyseletters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt the user to enter a word or type 'exit' to quit
            System.out.print("Enter a word or type 'exit' to quit: ");
            String word = scanner.nextLine();

            // Exit the program if the user types 'exit'
            if (word.equalsIgnoreCase("exit")) {
                break;
            }

            // Reverse the word  preserving the position of the capital letter
            String reversedWord = reverseWord(word);
            System.out.println("Reversed word: " + reversedWord);
        }

        scanner.close();
    }

    private static String reverseWord(String word) {
        StringBuilder sb = new StringBuilder(word);
        int n = sb.length();

        // Find the index of the last capital letter in the word
        int lastCapitalIndex = -1;
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(sb.charAt(i))) {
                lastCapitalIndex = i;
            }
        }

        // Reverse the word
        sb.reverse();

        // Move the capital letter to its original position
        if (lastCapitalIndex >= 0) {
            char lastCapital = sb.charAt(lastCapitalIndex);
            sb.deleteCharAt(lastCapitalIndex);
            sb.insert(0, lastCapital);
        }

        return sb.toString();
    }
}
