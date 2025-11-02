public class InputToOneDArray {

    public static void main(String[] args) {

        int n = StdIn.readInt();

        String[] options = new String[n];
        int[] votes = new int[n];

        for (int i = 0; i < n; i++) {
            options[i] = StdIn.readString();
            votes[i] = StdIn.readInt();
        }

        // Find and print the option with the most votes.
        int maxVotes = votes[0];
        String winningOption = options[0];
        for (int i = 1; i < n; i++) {
            if (votes[i] > maxVotes) {
                maxVotes = votes[i];
                winningOption = options[i];
            }
        }
        StdOut.println("First place: " + winningOption + " with " + maxVotes + " votes.");
        
        // Find and print the option with the least votes.
        int minVotes = votes[0];
        String losingOption = options[0];
        for (int i = 1; i < n; i++) {
            if (votes[i] < minVotes) {
                minVotes = votes[i];
                losingOption = options[i];
            }
        }
        StdOut.println("Last place: " + losingOption + " with " + minVotes + " votes.");
        
        
    }
    
}
