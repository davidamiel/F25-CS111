import java.util.Arrays;
public class ArrayEquality {
    public static void main(String[] args) {
        
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[5];
        int[] d = c;

        for (int i = 0; i < 5; i++)
            a[i] = i + 1;

        for (int i = 0; i < 5; i++)
            b[i] = i + 1;

        for (int i = 0; i < 5; i++)
            c[i] = i + 6;

		System.out.println("\ta, b:\t" + (a == b));
		System.out.println("\tc, d:\t" + (c == d));
        System.out.println("\ta, b:\t" + Arrays.equals(a, b));
		System.out.println("\tc, d:\t" + Arrays.equals(c, d));
    }
}

