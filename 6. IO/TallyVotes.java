public class TallyVotes {

    public static void main(String[] args) {

        String[] options = {"Chocolate", "Vanilla", "Raspberry", "Pistachio", "Coffee", "Toffee", "Caramel"};
        int[] votes = new int[7];

        while(StdIn.hasNextLine()) {
            String currentVote = StdIn.readLine();

            if(currentVote.equals("Chocolate")) {
                votes[0] ++;
            } else if(currentVote.equals("Vanilla")) {
                votes[1] ++;
            } else if(currentVote.equals("Raspberry")) {
                votes[2] ++;
            } else if(currentVote.equals("Pistachio")) {
                votes[3] ++;
            } else if(currentVote.equals("Coffee")) {
                votes[4] ++;
            } else if(currentVote.equals("Toffee")) {
                votes[5] ++;
            } else if(currentVote.equals("Caramel")) {
                votes[6] ++;
            }

        }

        int max = 0;
        int maxIndex = -1;

        for(int i = 0; i < votes.length; i++) {
            if(votes[i] > max) {
                max = votes[i];
                maxIndex = i;
            }
        }

        StdOut.println("Winner: " + options[maxIndex] + " with " + votes[maxIndex] + " votes!");

        

    }
    
}
