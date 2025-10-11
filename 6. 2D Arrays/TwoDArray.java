public class TwoDArray {

    public static void main(String[] args) {
        
        int[][] numbers = new int[3][3];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println();
            for(int j = 0; j < numbers[i].length; j++) {
                // System.out.print(numbers[i][j] + " ");
                System.out.print((i * j) + " ");
            }
        }
    
    
    }
    
}
