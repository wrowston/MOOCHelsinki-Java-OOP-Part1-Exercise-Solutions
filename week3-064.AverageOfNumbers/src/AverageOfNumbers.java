
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {

        int listSum = 0;
        for (int i : list) {
            listSum += i;
        }
        return listSum;
    }
    

    public static double average(ArrayList<Integer> list) {
        double result = (double) sum(list) / list.size();
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
