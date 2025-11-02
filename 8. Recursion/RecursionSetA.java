public class RecursionSetA {

    public static int f(int x) {
        if (x < 5) {
            return (x*x+1);
        } else if (x == 5) {
            return x*x-3;
        } else {
            return f(x-2);
        }
    }

    public static void printNumberI(int n) {
        for(int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }

    public static void printNumberR(int n) {
        if(n >= 0) {
            printNumberR(n-1);
            System.out.println(n);
        }
    }

    public static int factorialI(int n) {
        int product = 1;
        for(int i = 1; i <= n; i++) {
            product += i;
        }
        return product;
    }

    public static factorialR(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }


    
}
