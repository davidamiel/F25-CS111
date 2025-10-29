public class Average {

    public static void main(String[] args) {

        double sum = 0;
        int count = 0;

        while( ! StdIn.isEmpty() ) {
            int currentNumber = StdIn.readInt();
            sum += currentNumber;
            count++;
        }

        double average = sum / count;
        StdOut.println(average);
        
    }
    
}
