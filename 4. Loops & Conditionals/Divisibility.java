public class Divisibility {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        // Print all numbers between 1 and n that are divisible by 3 but not by 2.
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }

        // Print all numbers between 1 and n that are divisible by 3 but not by 2 with continue.
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        // Print all numbers between 1 and n that are divisible by 3 but not by 2 with continue.
        // Immediately stop if you find a number divisible by 3 and 13.
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 13 == 0) {
                    break;
                }
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}