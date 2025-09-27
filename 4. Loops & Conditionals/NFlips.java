public class NFlips {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

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
