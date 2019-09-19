import java.util.Scanner;

public class Grades {

    String grade0 = "";
    String grade1 = "";
    String grade2 = "";
    String grade3 = "";
    String grade4 = "";
    String grade5 = "";

    int sum;
    double acceptRate;

    public void grade(Scanner scanner){
        while(true){
            int score = Integer.parseInt(scanner.nextLine());

            if (score == -1){
                break;
            } else if (score >= 0 && score <= 29) {
                grade0 += "*";
            } else if (score >= 30 && score <= 34) {
                grade1 += "*";
            } else if (score >= 35 && score <= 39) {
                grade2 += "*";
            } else if (score >= 40 && score <= 44) {
                grade3 += "*";
            } else if (score >= 45 && score <= 49) {
                grade4 += "*";
            } else if (score >= 50 && score <= 60) {
                grade5 += "*";
            }
        }
    }

    public void printStars() {
        System.out.println("Grade distribution:");
        System.out.println("5: " + grade5);
        System.out.println("4: " + grade4);
        System.out.println("3: " + grade3);
        System.out.println("2: " + grade2);
        System.out.println("1: " + grade1);
        System.out.println("0: " + grade0);
    }

    public void acceptanceRate() {
        sum = grade1.length() + grade2.length()
                + grade3.length() + grade4.length()
                + grade5.length() + grade0.length();

        if (sum == 0){
            acceptRate = 0;
        } else{
            acceptRate = (sum - grade0.length()) * 100 / sum;
        }
        System.out.println("Acceptance percentage: " + acceptRate);
    }
}
