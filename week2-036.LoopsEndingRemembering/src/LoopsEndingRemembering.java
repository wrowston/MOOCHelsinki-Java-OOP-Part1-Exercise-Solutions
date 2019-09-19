import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        //36.1
        int n = -1;
        int input;
        int sum = 0;
        int count = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        System.out.println("Type numbers: ");
        input = Integer.parseInt(reader.nextLine());

        while (input != n) {
            sum += input;
            count++;
            average = (double) sum/count;

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            System.out.println("Type numbers: ");
            input = Integer.parseInt(reader.nextLine());
        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("The average is " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);


    }
}
