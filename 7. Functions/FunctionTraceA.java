public class FunctionTraceA {
    
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        
        int result1 = mystery(a, b);
        int result2 = mystery(b, a);
        int result3 = mystery(a + b, result1);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }

    public static int mystery(int x, int y) {
        return (x * y) - (x + y);
    }
}

