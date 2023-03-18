// User story 3 - HashMap to collect key value pairs  of information
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyHashMap {
    public static void main(String[] args) {
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("city", "london");
        dataMap.put("language", "english");
        dataMap.put("course", "software development");
        dataMap.put("month", "march");
        dataMap.put("HLT", "week 9 ");
        dataMap.put("eclipse", "java ");

        Scanner sc = new Scanner(System.in);
        String userInput = "";
        while (!userInput.equals("exit")) {
            System.out.print("Enter the name of the data you want to access (or type 'exit' to quit): ");
            userInput = sc.nextLine();
            if (userInput.equals("exit")) {
                break;
            }
            if (dataMap.containsKey(userInput)) {
                String dataValue = dataMap.get(userInput);
                System.out.println("Value of " + userInput + " is " + dataValue);
            } else {
                System.out.println("Data not found. You can choose the following : city, language, course, month, HLT or eclipse");
            }
        }
        sc.close();
    }
}

