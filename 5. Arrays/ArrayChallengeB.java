public class ArrayChallengeB {

    public static void main(String[] args) {
        
        // Create an array that stores 10 doubles.
        double[] doubles = new double[10]; 
        
        // Print the length of the array. 
        int length = doubles.length;
        System.out.println("Length: " + length);
        
        // Print the 5th element.
        System.out.println("Element 5: " + doubles[4]);
        
        // Set the first and last elements to be π.
        doubles[0] = Math.PI;
        doubles[doubles.length - 1] = Math.PI;
        
        // Add 15 to the elements at indices 5, 6, and 7.
        doubles[5] = doubles[5] + 15;
        doubles[6] += 15;
        doubles[7] += 15;

        // Print the array.
        System.out.println();
        for(int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }

    }
}