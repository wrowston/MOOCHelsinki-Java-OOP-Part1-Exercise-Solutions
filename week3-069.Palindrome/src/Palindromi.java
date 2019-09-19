import java.util.Scanner;

public class Palindromi {

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


    public static boolean palindrome(String text) {

        return text.equals(reverse(text));
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
