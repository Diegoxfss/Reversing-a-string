//Main class with all 4 programs together 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("exit")) {
            // Prompt the user to select a program to run
            System.out.print("Select a program to run (1 = Reverse a word with capital letters, 2 = Times table generator, 3 = HashMap key-value pairs, 4 = Reverse a sentence, or type 'exit' to quit): ");
            userInput = scanner.nextLine();

            // Exit the program if the user types 'exit'
            if (userInput.equals("exit")) {
                break;
            }

            // Call the appropriate program based on user input
            switch (userInput) {
                case "1":
                    Analyseletters.main(args);
                    break;
                case "2":
                    TimesTable.main(args);
                    break;
                case "3":
                    MyHashMap.main(args);
                    break;
                case "4":
                    ReversedSentence.main(args);
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}
