// User story 2 : times table generator
import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = "";
        while (!userInput.equals("exit")) {
            // Prompt the user to enter a number
            System.out.print("Enter a number to generate its times table (or type 'exit' to quit): ");
            userInput = sc.nextLine();
            // Exit the program if the user types 'exit'
            if (userInput.equals("exit")) {
                break;
            }
            int num = Integer.parseInt(userInput);
            System.out.println("Times table for " + num + ":");		
            // for loop iterates until i is less than or equal to 10
            for (int i = 1; i <= 10; i++) {
            	// user input times i which goes from 1 to 10 above on the loop
                int result = num * i;
                System.out.println(num + " x " + i + " = " + result);
            }
            System.out.println();
        }
        sc.close();
    }
}