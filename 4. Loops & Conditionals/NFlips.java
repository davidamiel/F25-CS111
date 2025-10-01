public class NFlips {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        // Flip a coin n times, print the result of each flip.
        // While Loop
        int count = 0;
        while (count < n) {
            double randomNum = Math.random();
            if (randomNum < 0.5) {
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }
            count++;
        }

        // For Loop
        for (int i = 0; i < n; i++) {
            double randomNum = Math.random();
            if (randomNum < 0.5) {
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }
        }

        // Flip n coins, print the number of heads.
        // While Loop
        int headsCountWhile = 0;
        int flips = 0;
        while (flips < n) {
            double randomNum = Math.random();
            if (randomNum < 0.5) {
                headsCountWhile++;
            }
            flips++;
        }
        System.out.println("Number of heads: " + headsCountWhile);

        // For Loop
        int headsCount = 0;
        for (int i = 0; i < n; i++) {
            double randomNum = Math.random();
            if (randomNum < 0.5) {
                headsCount++;
            }
        }
        System.out.println("Number of heads: " + headsCount);
    }
}
