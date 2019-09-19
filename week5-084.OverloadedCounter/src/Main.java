public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter test = new Counter(20, true);
        System.out.println(test.value());
        test.decrease();
        System.out.println(test.value());
        test.decrease(25);
        System.out.println(test.value());
        test.increase();
        System.out.println(test.value());
        test.increase(5);
        System.out.println(test.value());

        Counter test2 = new Counter(50);
        System.out.println(test2.value());

        Counter test3 = new Counter(true);
        System.out.println(test3.value());

        Counter test4 = new Counter();
        System.out.println(test4.value());
    }
}
