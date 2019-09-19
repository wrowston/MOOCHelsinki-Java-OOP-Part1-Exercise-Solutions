
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Until what number? ");


        int n = Integer.parseInt(reader.nextLine());
        int i = 1;
        int result = 0;

        while (i <= n) {
            result = i + result;
            i ++;
        }

        System.out.println("The sum is " + result);
    }
}
