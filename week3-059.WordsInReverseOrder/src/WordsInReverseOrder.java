import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();

            if (input.isEmpty()) {
                break;
            }
            words.add(input);
        }
        Collections.reverse(words);

        System.out.println("The reverse order of the words you typed is: ");
        for (String input : words) {
            System.out.println(input);
        }

    }
}
