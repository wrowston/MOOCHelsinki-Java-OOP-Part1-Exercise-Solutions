
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does not print anything, it RETURNS the reversed string
        String helper = "";
        int i = 1;
        while (i <= text.length()) {
            char character = text.charAt(text.length()-i);
            helper += character;
            i++;
        }
        return helper;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
