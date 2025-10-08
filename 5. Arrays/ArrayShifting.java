import java.util.Arrays;

public class ArrayShifting {

    public static void main(String[] args) {

        double[] data = {1.1, 2.2, 3.3, 4.4, 5.5};
        // Shift all the elements in an array to the left.
        // Move first element in the original array to the last space in the new array.

        double firstElement = data[0];
        for(int i = 0; i < data.length-1; i++) {
            data[i] = data[i+1];
        }
        data[data.length - 1] = firstElement;



        int[] values = {10, 20, 30, 40, 50, 60, 70};

        // Shift all the elements in an array to the right.
        // Move last element in the original array to the first space in the new array.

        int lastElement = values[values.length - 1];
        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = lastElement;

    }

    
}
