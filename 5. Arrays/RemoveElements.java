public class RemoveElements {

    public static void main(String[] args) {

        // Remove all negative values in an array and replace them with 0.

        int[] numbers = {3, -1, 4, -2, 5, -3, 6};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                numbers[i] = 0;
            }
        }

        // Print the modified array.
        for (int num : numbers) {
            System.out.print(num + " ");
        }



    }
    
}
