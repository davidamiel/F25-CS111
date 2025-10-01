public class Factors {

	public static void main(String[] args) {

		long n = Long.parseLong(args[0]);

		for (int i = 2; i < n; i++) { // change to n/i
			
			while (n % i == 0) {  
				System.out.print(i + " ");
				n = n / i;  
			}
		}

		if (n > 1)
			System.out.println(n);
		else
			System.out.println();
   }
}

