public class ClassAverage {

    public static void main(String[] args) {

        // Add up random numbers from the user
        double sum = 0.0;
        int n = 0;

        while(!StdIn.isEmpty()) {
            double nextNumber = StdIn.readDouble();
            sum = sum + nextNumber;
            n = n + 1;
        }

        // Divide their sum by the number of numbers
        StdOut.print(sum / n);


    }


    
}
