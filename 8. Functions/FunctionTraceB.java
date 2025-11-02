public class FunctionTraceB {

    public static int firstFunction(int a, int b) {
        int temp1 = secondFunction(a);
        int temp2 = thirdFunction(b);
        return combine(temp1, temp2);
    }

    public static int secondFunction(int num) {
        return num * num - 2;
    }

    public static int thirdFunction(int num) {
        return (num % 3) + (num / 2);
    }

    public static int combine(int val1, int val2) {
        return (val1 + val2) * 2;
    }

    public static void main(String[] args) {
        int x = 4;
        int y = 7;
        System.out.println(firstFunction(x, y));
    }

}
