public class ArrayChallengeA {

    public static void main(String[] args) {
        
        // Create an array that stores integers 1 through 5.
        int[] arrayA = {1, 2, 3, 4, 5};
        
        // Print the first, middle, and last elements.
        System.out.println("First element: " + arrayA[0]);
        System.out.println("Middle element: " + arrayA[2]);
        System.out.println("Last element: " + arrayA[4]);
        
        // Print the sum of the first three elements.
        int sum = arrayA[0] + arrayA[1] + arrayA[2];
        System.out.println("Sum of first three elements: " + sum);
        
        // Print the average of the last three elements.
        double average = (double) (arrayA[2] + arrayA[3] + arrayA[4]) / 3;
        System.out.println("Average of last three elements: " + average);
        
        // Swap the second and third elements. 
        // swapping index 1 and 2
        int temp = arrayA[1];
        arrayA[1] = arrayA[2];
        arrayA[2] = temp;


    }
    
}
