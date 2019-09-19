import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallestSoFar = array[0];

        for (int i : array){

            if (i < smallestSoFar){
                smallestSoFar = i;
            }
        }
        return smallestSoFar;
    }

    public static int indexOfTheSmallest(int[] array) {

        for (int i = 0; i < array.length; i++){

            if (array[i] == smallest(array)) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int theIndexOfSmallest = index;

        for (int i = index; i < array.length; i++) {

            if (array[i] < array[theIndexOfSmallest]){
                theIndexOfSmallest = i;
            }
        }
        return theIndexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {

        int firstValue = array[index1];
        array[index1] = array[index2];
        array[index2] = firstValue;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {

            System.out.println(Arrays.toString(array));

            swap(array, indexOfTheSmallestStartingFrom(array, i), i);

        }

    }
}
