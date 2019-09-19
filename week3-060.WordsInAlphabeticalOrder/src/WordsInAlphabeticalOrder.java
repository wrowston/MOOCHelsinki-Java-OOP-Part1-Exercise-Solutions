
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

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
        Collections.sort(words);

        System.out.println("The words you typed in alphabetical order: ");
        for (String input : words) {
            System.out.println(input);
        }
    }
}
