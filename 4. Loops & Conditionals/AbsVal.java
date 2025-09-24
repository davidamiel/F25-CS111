public class AbsVal {
    public static void main(String args[]) {
        double x = Double.parseDouble(args[0]);
        if (x < 0) {
            x = x * -1;
        }
        System.out.println(x);
    }
}