public class DivisibleBy {

    public static void main(String[] args) {
        
        int n = Integer.parseInt(args[0]);

        for(int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 2 != 0) {
                System.out.println(i);
            }


        }
    }
    
}
