import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        // Declare variables
        int a, b, sum;

        // Get numbers from user
        System.out.print("Type a number: ");
        a = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        b = Integer.parseInt(reader.nextLine());

        // Calculate sum
        sum = a + b;

        // Display result
        System.out.println("Sum of the numbers: " + sum);
    }
}