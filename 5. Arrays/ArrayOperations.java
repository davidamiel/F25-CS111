public class ArrayOperations {

    public static void main(String[] args) {

        int[] integers = {5, 3, 8, 1, 2};
        double[] doubles = {2.5, 3.6, 1.2, 4.8, 3.3};
        String[] strings = {"apple", "orange", "banana", "grape", "kiwi"};

        // Traverse and display the elements in an array in order and in reverse order.
        // Example below uses the int array.
        System.out.println("Array elements in order:");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + " ");
        }

        System.out.println("\nArray elements in reverse order:");
        for (int i = integers.length - 1; i >= 0; i--) {
            System.out.print(integers[i] + " ");
        }
        System.out.println();

        // Reverse the elements in an array.
        // Example below uses the double array.
        for (int i = 0; i < doubles.length / 2; i++) {
            double temp = doubles[i];
            doubles[i] = doubles[doubles.length - 1 - i];
            doubles[doubles.length - 1 - i] = temp;
        }
        
        System.out.println("Reversed double array:");
        for (double num : doubles) {
            System.out.print(num + " ");
        }
        System.out.println();
        

        // Find and report the minimum/maximum value in an array.
        double min = doubles[0];
        for (int i = 1; i < doubles.length; i++) {
            if (doubles[i] < min) {
                min = doubles[i];
            }
        }
        System.out.println("Minimum value in double array: " + min);



        // Find and report the index of the minimum/maximum value in an array.
        int maxIndex = 0;
        for (int i = 1; i < integers.length; i++) {
            if (integers[i] > integers[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Index of maximum value in integer array: " + maxIndex);

        // Find the average of numerical values in an array.
        double sum = 0;
        for (double num : doubles) {
            sum += num;
        }
        double average = sum / doubles.length;
        System.out.println("Average of double array: " + average);

        // Exchange values of two elements in an array.
        int temp = integers[0];
        integers[0] = integers[1];
        integers[1] = temp;
        
        // Shift elements in array to the right/left as specifications describe.
        String firstElement = strings[0];
        for (int i = 0; i < strings.length - 1; i++) {
            strings[i] = strings[i + 1];
        }
        strings[strings.length - 1] = firstElement;
        System.out.println("String array after left shift:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();

        // Count the number of elements in an array satisfying given specifications.
        int countGreaterThanThree = 0;
        for (int num : integers) {
            if (num > 3) {
                countGreaterThanThree++;
            }
        }
        System.out.println("Count of integers greater than 3: " + countGreaterThanThree);

        // Remove elements that satisfy certain conditions from an array.
        /// replace all even values in the array with zero.
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                integers[i] = 0;
            }
        }
        System.out.println("Integer array after replacing even values with zero:");
        for (int num : integers) {
            System.out.print(num + " ");
        }
        System.out.println();

    
    }
}