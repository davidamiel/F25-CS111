public class TenFlips {

    public static void main(String[] args) {

        // Write a program that simulates flipping a coin 10 times.
        
        // While Loop
        int count = 0;
        while (count < 10) {
            double randomNum = Math.random();
            if (randomNum < 0.5) {
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }
            count++;
        }
        
        // For Loop
        for (int i = 0; i < 10; i++) {
            double randomNum = Math.random();
            if (randomNum < 0.5) {
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }
        }

        // Flip 10 coins, print the number of heads.

        // While Loop
        int headsCountWhile = 0;
        int flips = 0;
        while (flips < 10) {
            double randomNum = Math.random();
            if (randomNum < 0.5) {
                headsCountWhile++;
            }
            flips++;
        }
        System.out.println("Number of heads: " + headsCountWhile);

        // For Loop
        int headsCount = 0;
        for (int i = 0; i < 10; i++) {
            double randomNum = Math.random();
            if (randomNum < 0.5) {
                headsCount++;
            }
        System.out.println("Number of heads: " + headsCount);
        }


        
    }
    
}
