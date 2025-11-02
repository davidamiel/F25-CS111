public class CountingEvenInputs {
    public static void main(String[] args) {

        int evenCount = 0;
        for (int i = 0; i < 10; i++) {
            int number = StdIn.readInt();
            if (number % 2 == 0) {
                StdOut.println(number + " is even");
                evenCount++;
            }
        }
        StdOut.println("Total even numbers: " + evenCount);
    }
}
