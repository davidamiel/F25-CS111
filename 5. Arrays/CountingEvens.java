public class CountingEvens {

    public static void main(String[] args) {
        double[] numbers = {2, 5, 8, 3, 6, 7, 4, 1};
        int count = 0;
        for(int i = 0; i < numbers.length; i ++) {
            if (numbers[i] % 2 == 0) { // is the double at the ith index of numbers even?
                count ++;
            }
        }
        System.out.println("Evens: " + count);

        count = 0;
        for(double value : numbers) {
            if(value % 2 == 0) {
                count ++;
            }
        }
        System.out.println("Evens: " + count);

        int sum = 0;
        for (double value : numbers) {
            if(value % 2 == 0 && value > 4) {
                sum += value;
            }
        }
        System.out.println("Sum: " + sum);

    }
    
}
