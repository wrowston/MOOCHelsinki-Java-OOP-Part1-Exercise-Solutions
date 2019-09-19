import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {

        // The first candidate for the greatest is the first in the list
        int greatestSoFar = list.get(0);
        // then we iterate over the whole list
        for (int luku : list) {
            // if a greater found, we take that as the candidate for greatest
            if (luku > greatestSoFar) {
                greatestSoFar = luku;
            }
        }
        return greatestSoFar;

        /* much easier to do
        return Collections.max(list);
         */
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
