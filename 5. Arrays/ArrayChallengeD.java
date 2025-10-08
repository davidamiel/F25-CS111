import java.util.Arrays;

public class ArrayChallengeD {
    public static void main(String[] args) {
        
    // Create an array named scores that can hold 8 integers.
    int[] scores = new int[8];

    // Fill the array with command line inputs. If there are no inputs, set all values in the array to 85.

    if (args.length == 0) {
        // We don't have anything in args to use!
        Arrays.fill(scores, 85); 
    } else {
        // We DO have args to use! Woohoo!
        for(int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(args[i]);
        }
    }

    // Manually set the 3rd element to 75 and the 7th element to 98.
    scores[2] = 75;
    scores[6] = 98;

    // Swap the 3rd and 4th element in the array. (Index 2 and Index 3)
    int temp;
    temp = scores[2];
    scores[2] = scores[3];
    scores[3] = temp;

	// Compute and print the minimum element in the array.
    int min = scores[0];
    for ( int i = 0; i < scores.length; i++) {
        if(scores[i] < min) {
            min = scores[i];
        }
    }

    // Create a copy of the array reference called backup. 
    // int[] backup = scores; - nope!
    int[] backup = new int[scores.length];
    for(int i = 0; i < backup.length; i++) {
        backup[i] = scores[i];
    }

    // Change backup[0] to 0.
    backup[0] = 0;

    // Print both scores and backup.
    for(int i = 0; i < scores.length; i++) {
        System.out.print(scores[i] + " ");
    }
    System.out.println();
    for(int i = 0; i < backup.length; i++) {
        System.out.print(backup[i] + " ");
    }

    }
}