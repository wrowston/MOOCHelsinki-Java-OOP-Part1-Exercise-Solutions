
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = 2;
        int i = 0;

        System.out.println("Enter a number: ");
        int power = Integer.parseInt(reader.nextLine());

        int result = 0;

        while (i <= power) {
            result += (int)Math.pow(number, i) ;
            i++;
        }

        System.out.println("The sum of powers is: " + result);
    }
}
