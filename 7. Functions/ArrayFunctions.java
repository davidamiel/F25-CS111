public class ArrayFunctions {

    // 0. Print Array (to use when testing/tracing!)
    public static void printArray(int[] arr){
        StdOut.println();
        for(int x : arr) {
            StdOut.print(x + "\t");
        }
        StdOut.println();
    }

    // 1. Sum of a 1-D integer array
    public static int sum(int[] arr) {
        int total = 0;
        for (int val : arr) {
            total += val;
        }
        return total;
    }

    // 2. Double every value of an integer array in place
    public static void doubleInPlace(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    // 3. Double every value of an integer array in a new array (leave original unchanged)
    public static int[] doubleNew(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * 2;
        }
        return result;
    }

    // 4. Swap two values of an array
    public static void swap(int[] arr, int i, int j) {
        if (i < 0 || j < 0 || i >= arr.length || j >= arr.length) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 5. Reverse the elements of an array 
    public static void reverse(int[] arr) {
        for(int i = 0; i < arr.length/2; i++) {
            swap(arr, i, arr.length - i - 1);
        }

        /* ALTERNATE VERSION - might be easier to conceptualize!
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
        */
    }

    // 6. Slide all elements of an array to the left (first element becomes last)
    public static void slideLeft(int[] arr) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        /* ALTERNATE VERSION!
        for(int i = 0; i < arr.length - 1; i++) {
            swap(arr, i, i+1);
        } 
         */
    }

    // 7. Calculate the maximum value in a 2-D double array
    public static double max2D(double[][] arr) {
        double max = arr[0][0];
        for(int row = 0; row < arr.length; row ++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    // 8. Calculate the sum of a specified column in a 2-D double array
    public static double sumColumn(double[][] arr, int col) {
        double sum = 0;
        for(int row = 0; row < arr.length; row++) {
            sum += arr[row][col];
        }
        return sum;
        
        /* - This version does NOT assume the array is rectangular.
        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if (col >= 0 && col < arr[i].length) {
                sum += arr[i][col];
            }
        }
        return sum;
        */
    }

}