import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers:");
        NumberStatistics sumOfAll = new NumberStatistics();
        NumberStatistics sumOfEven = new NumberStatistics();
        NumberStatistics sumOfOdd = new NumberStatistics();

        while (true) {
            int input = Integer.parseInt(reader.nextLine());

            if (input == -1){
                break;
            } else if (input % 2 == 0) {
                sumOfEven.addNumber(input);
            } else if (input % 2 != 0) {      // can just be else statement here since we already tested for even and -1
                sumOfOdd.addNumber(input);
            }
            sumOfAll.addNumber(input);
        }

        System.out.println("sum: " + sumOfAll.sum());
        System.out.println("sum of even: " + sumOfEven.sum());
        System.out.println("sum of odd: " + sumOfOdd.sum());

    }
}
