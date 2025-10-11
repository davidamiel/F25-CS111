public class TwoDTraversals {

    public static void main(String[] args) {
        
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int i, j;

        // Row-major traversal
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Column-major traversal
        for (j = 0; j < arr[0].length; j++) {
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
