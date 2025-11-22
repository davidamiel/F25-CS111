public class TimingCode {

    public static void main(String[] args) {
        double start;
        double end;
        double time; 
        start = System.currentTimeMillis();

        // CODE HERE THAT WE WANT TO TIME
        
        end = System.currentTimeMillis(); 
        time = end – start;
        Standard.out.printf("%.0f seconds", time);
    }
    
}
