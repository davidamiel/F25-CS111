public class FunctionTraceC {

    public static void main(String[] args) {
        int a = spooky(4);
        int b = spooky(4.0);

        StdOut.println("spooky(4) = " + a);
        StdOut.println("spooky(4.0) = " + b);

    }

    public static int spooky(int x) {
        int ans = x + 3;
        return ans;
    }

    public static int spooky(double x) {
        int ans = (int)x * 2 + 1;
        return ans;
    }

    
    
}
