public class AnasCats {

    public static void main(String[] args) {

        // read 10 numbers from the user, display the number that are even
        // using StdIn and StdOut

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
