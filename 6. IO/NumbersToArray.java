public class NumbersToArray {

    public static void main(String[] args) {

        int size = Integer.parseInt(args[0]);

        int[] numbers = new int[size];

        int index = 0;

        while(!StdIn.isEmpty() && index < size) {

            // OPTION 1
            numbers[index] = StdIn.readInt();
            index++;

            // OPTION 2
            // numbers[index++] = StdIn.readInt();

        }

        while(index < size) {
            numbers[index] = -1;
            index ++;
        }

        System.out.println();

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }







    }
    
}