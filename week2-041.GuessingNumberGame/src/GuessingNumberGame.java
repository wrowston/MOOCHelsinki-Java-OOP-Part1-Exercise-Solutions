
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int countGuesses = 1;

        // program your solution here. Do not touch the above lines
        while (true) {

            System.out.println("Guess a number between 0 and 100: ");
            int numberGuess = Integer.parseInt(reader.nextLine());

            if (numberGuess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (numberGuess > numberDrawn){
                System.out.println("The number is lesser, guesses made: " + countGuesses);
            } else {
                System.out.println("The number is greater, guesses made: " + countGuesses);
            }
            countGuesses++;
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
