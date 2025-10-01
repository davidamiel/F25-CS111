public class LargestDigit {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int largest = 0;

        while (n > 0) {
            int digit = n % 10;
            if (digit > largest)
                largest = digit;
            n = n / 10;
        }
        System.out.println(largest);
    }
}