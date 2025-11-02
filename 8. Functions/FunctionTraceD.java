public class FunctionTraceD {

    public static void main(String[] args) {
        int x = StdIn.readInt();
        int y = StdIn.readInt();
        double z = 4.5;

        int partOne = boo(x);
        int partTwo = boo(x, y);
        int partThree = boo(y, z);

        StdOut.println(partOne + partThree);
        StdOut.println(partTwo);
    }

    public static int boo(int a) {
        int ans = a * a;
        return ans;
    }

    public static int boo(int a, int b) {
        int ans = b - a;
        return ans; 
    }

    public static int boo(int a, double b) {
        int ans = (int)(b*2) - a;
        return ans;
    }

}