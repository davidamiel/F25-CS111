public class ArrayMystery {

    public static void main(String[] args) {
        
        int a = 3;
        int b = a;
        a = 4;
		System.out.println("a = " + a);
		System.out.println("b = " + b);


		int[] A = {3, 3, 3};
		int[] B = A;
        A[1] = 4;
		System.out.println("A[1] = " + A[1]);
		System.out.println("B[1] = " + B[1]);

    }
}

