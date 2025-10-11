public class ForEach {

    public static void main(String[] args) {

        int[] numbers = {10, 40, 24, 68, 36};

        for(int i = 0; i < numbers.length; i+= 2) {
            int value = numbers[i];
            System.out.println(value);
            value = 4;
        }

        for(int value : numbers) {
            System.out.println(value);
            value = 4;
        }
        
    }
    
}
