public class CallStackTrace {
    public static void main(String[] args) {
        int x = 3, y = 4;
        int z = add(multiply(square(x), y), add(x, square(y)));
        System.out.println(z);
    }

    public static int add(int a, int b) { 
        return a+b; 
    }

    public static int multiply(int a, int b) { 
        return a*b;
    }
    
    public static int square(int a) { 
        return a*a;
    }

}
