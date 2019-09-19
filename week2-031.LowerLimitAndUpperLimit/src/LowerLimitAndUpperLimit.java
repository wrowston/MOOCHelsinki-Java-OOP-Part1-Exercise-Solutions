
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What is the first number? ");
        int first = Integer.parseInt(reader.nextLine());

        System.out.println("What is the second number?");
        int second = Integer.parseInt(reader.nextLine());

        int number = first;
        while (number <= second) {
            System.out.println(number);
            number++;

        }

    }
}
