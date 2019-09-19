public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");

    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount) {
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        int x = size - 1; //no need for extra variable, can put size - 1 in parameter for printWhitespaces() see below
        while (i <= size) {
            printWhitespaces(x);
            printStars(i);
            i++;
            x--;
        }
    }
    /*public static void printTriangle(int size) {
        int i = 1;  //this is to count the start
        while (i <= size) {
            printWhitespaces(size - i);
            printStars(i);
            i++;
        }
    }

     */

    public static void xmasTree(int height) {
        // 40.3
        int x = height - 1; //again, don't need extra variable
        int i = 1;
        int y = 0;
        while (i <= height) {
            printWhitespaces(x);
            x--;
            printStars(i + y);  //see below for better solution, amount of stars on each line is an odd number
            i++;
            y++;
            if (i > height) {  // better to use for loop, see below
                while (true) {
                    printWhitespaces(height - 2);
                    printStars(3);
                    printWhitespaces(height - 2);
                    printStars(3);
                    break;
                }
            }
        }
    }

    /* public static void xmasTree(int height) {
        int i = 0;
        while (i < height) {
            printWhitespaces(height - (i + 1));
            printStars(2 * i + 1);
            i++;
        }
        int n = 1;
        for (n = 1; n < 3; n++) {
            printWhitespaces(height - 2);
            printStars(3);
        }

    }

     */

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
