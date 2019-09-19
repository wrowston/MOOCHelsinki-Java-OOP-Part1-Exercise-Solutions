
public class Main {

    public static void main(String[] args) {
        // This is an empty main method which you can use to test your class's functionality.
        Multiplier threeMultiplier = new Multiplier(3);
        Multiplier fourMultiplier = new Multiplier(4);

        System.out.println("3 * 5 = " + threeMultiplier.multiply(5));
        System.out.println("4 * 5 = " + fourMultiplier.multiply(5));
    }
}
