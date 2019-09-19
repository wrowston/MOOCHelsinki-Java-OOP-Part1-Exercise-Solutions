import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();


        while (true) {
            System.out.print("Type word here: ");
            String input = reader.nextLine();

            if (words.contains(input)) {
                System.out.println("You typed the word " + input + " twice.");
                break;
            }

            words.add(input); //add user input after if statement so that it doesnt break loop after one word
        }
    }
}
