
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Choose your first number (lower number): ");
        int x = Integer.parseInt(reader.nextLine());

        System.out.println("Choose your second number (higher number): ");
        int y = Integer.parseInt(reader.nextLine());

        int result = 0;

        while (x <= y) {
            result = x + result;
            x++;
        }

        System.out.println("The sum is " + result);

    }
}
