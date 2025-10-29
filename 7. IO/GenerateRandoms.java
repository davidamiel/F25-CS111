public class GenerateRandoms {

    public static void main(String[] args) {
        
        int max = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        // generate n random numbers between 1 and max, print them to the command line

        // Math.random() -> double between 0 and 1

        for(int i = 0; i < n; i++) {
            int randomNum = (int) (Math.random() * max) + 1;
            StdOut.println(randomNum);
        }

    }
    
}
