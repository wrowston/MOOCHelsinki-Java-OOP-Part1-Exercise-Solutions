import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();

        int index = name.length();
        int i = 0;

        System.out.println("In reverse order: ");
        while (index > i) {
            System.out.print(name.charAt(index - 1));
            index--;
        }

    }
}
