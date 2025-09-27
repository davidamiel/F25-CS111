class RandomNumbers {
    public static void main(String[] args) {

        int max = Integer.parseInt(args[0]);

        // Print 5 random numbers between 1 and max (inclusive).

        // While Loop
        int count = 0;
        while (count < 5) {
            int randomNum = (int) ((Math.random() * max) + 1);
            System.out.println(randomNum);
            count++;
        }
        
        // For Loop
        for (int i = 0; i <= 5; i++) {
            int randomNum = (int) ((Math.random() * max) + 1);
            System.out.println(randomNum);
        }
    }
}