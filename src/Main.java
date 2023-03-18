import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selectedProgram;

        // Loop until user types "exit" to quit
        do {
            // Prompt the user to select a program to run
            System.out.print("Select a program to run (1 = Reverse a word with capital letters, 2 = Times table generator, 3 = HashMap key-value pairs, 4 = Reverse a sentence, or type 'exit' to quit): ");
            selectedProgram = scanner.nextLine();

            // Match user input with corresponding program
            switch (selectedProgram) {
                case "1":
                    // Reverse a word with capital letters
                    Reverseword.main(args);
                    break;
                case "2":
                    // Generate a multiplication table
                    TimesTable.main(args);
                    break;
                case "3":
                    // Create a HashMap with key-value pairs
                    MyHashMap.main(args);
                    break;
                case "4":
                    // Reverse a sentence
                    ReversedSentence.main(args);
                    break;
                case "exit":
                    // Exit the program if the user types 'exit'
                    break;
                default:
                    // Invalid input error message
                    System.out.println("Invalid input. Please try again.");
                    break;
            }
        } while (!selectedProgram.equals("exit"));

        // Close the Scanner object to free up system resources
        scanner.close();
    }
}