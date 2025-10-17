public class Randoms {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            double r = Math.random();
            StdOut.println(r);
        }

    }
    
}
