import java.util.ArrayList;

public class Variance {
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

    public static double variance(ArrayList<Integer> list) {
        double var = 0;
        double total = 0;
        double average = average(list);
        for (int num : list){
            var = Math.pow(num - average, 2);
            total += var;
        }
        total = total / (list.size() - 1);
        return total;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
