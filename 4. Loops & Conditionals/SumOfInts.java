public class SumOfInts {
   public static void main(String[] args) {

      int n = 0;
      int N = Integer.parseInt(args[0]);
      int sum = 0;

      // Compute the sum of the integers from 1 to N.

      // While Loop
      while(n <= N) {
         sum = sum + n;
         n = n + 1;
      }
      System.out.println("Sum: " + sum);


      // For Loop
      sum = 0; // Reset sum to 0 before the for loop
      for (int i = 1; i <= N; i++) {
         sum = sum + i;
      }
      System.out.println("Sum: " + sum);
      
   }
}
