public class GenerateVotes {

    public static void main(String[] args) {
        
        String[] options = new String[7];
        int index = 0;

        while(StdIn.hasNextLine()) {
            String currentOption = StdIn.readLine();
            options[index] = currentOption;
            index++;
        }

        int votes = Integer.parseInt(args[0]);

        for(int i = 0; i < votes; i++) {
            int currentVote = (int) (Math.random() * options.length);
            StdOut.println(options[currentVote]);
        }


    }
    
}
