public class InputToTwoDArray {

    public static void main(String[] args) {

        int cols = StdIn.readInt();
        int items = StdIn.readInt();
        int requestedCol = StdIn.readInt();

        int rows = items / cols;
        if (items % cols != 0) {
            rows++; // Add an extra row for remaining items
        }

        int[][] array = new int[rows][cols];
        int currentItem = 0;
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows; r++) {
                if (currentItem < items) {
                    array[r][c] = StdIn.readInt();
                    currentItem++;
                } else {
                    array[r][c] = 0; // Fill remaining cells with 0
                }
            }
        }

        // Print the 2D array
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                StdOut.print(array[r][c] + "\t");
            }
            StdOut.println();
        }

        // Get the sum of the requested column
        int sum = 0;
        for (int r = 0; r < rows; r++) {
            sum += array[r][requestedCol];
        }
        StdOut.println("Sum of column " + requestedCol + " = " + sum);



    }
    
}
