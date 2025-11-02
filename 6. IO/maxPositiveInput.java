public class maxPositiveInput {

    public static void main(String[] args) {

        int max = 0;

        while (!StdIn.isEmpty()) {
            int num = StdIn.readInt();
            if (num > max) {
                max = num;
            }
        }

        if (max == 0) {
            StdOut.println("No positive were provided.");
        } else {
            StdOut.println("The maximum input is: " + max);
        }
    }
}