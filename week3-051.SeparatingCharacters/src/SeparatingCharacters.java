
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();

        int i = 0;
        int length = name.length();
        int characterPosition = 1;
        while (i < length) {
            System.out.println(characterPosition + ". character: " + name.charAt(i));
            i++;
            characterPosition++;
        }
    }
}
