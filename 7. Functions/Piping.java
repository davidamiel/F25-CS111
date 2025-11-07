public class Piping {

    public static void main(String[] args) {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        double c = 3.2;

        int part1 = foo(a);
        int part2 = foo(a, b);
        int part3 = foo(b, c);

        StdOut.println(part1 + part3);
        StdOut.println(part2);
    }

    public static int foo(int x) {
        return x + 1;
    }

    public static int foo(int x, int y) {
        return x * y;
    }

    public static int foo(int x, double y) {
        return (int)(y * 2) + x;
    }
}