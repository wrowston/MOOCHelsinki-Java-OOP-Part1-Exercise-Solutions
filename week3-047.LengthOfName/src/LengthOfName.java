
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        String name = reader.nextLine();
        System.out.println("Type your name: " + name);
        System.out.println("Number of characters: " + calculateCharacters(name));
    }
    
    // do here the method
    public static int calculateCharacters(String name) {

        return name.length();
    }
    
}