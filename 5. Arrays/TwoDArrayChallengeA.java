public class TwoDArrayChallengeA {

    public static void main(String[] args) {

        // Create a 3x4 String[][] called labels.
        String[][] labels = new String[3][4];

        // Fill so labels[i][j] = "r" + i + "c" + j.
        for(int i = 0; i < labels.length; i++) { // for every row
            for(int j = 0; j < labels[i].length; j++) {
                labels[i][j] = "r" + i + "c" + j;
            }
        }

        // Print dimensions: rows, cols.
        System.out.println("Rows: " + labels.length);
        System.out.println("Cols: " + labels[0].length);

        // Traverse in ROW-major order and print each element.
        for(int i = 0; i < labels.length; i++) { // for every row
            for(int j = 0; j < labels[i].length; j++) {
                // System.out.println(labels[i][j] + " ");
            }
        }

        // Traverse in COLUMN-major order and print each element.
        for(int j = 0; j < labels[0].length; j++) {
            for(int i = 0; i < labels.length; i++) {
                System.out.println(labels[i][j]);
            }
        }        

        // Swap row 0 and row 2, then print the array as a grid.
        String[] temp = labels[0];
        labels[0] = labels[2];
        labels[2] = temp;

        // Alternative way to swap row 0 and row 2
        for(int i = 0; i < labels[0].length; i++) {
            String temptwo = labels[0][i];
            labels[0][i] = labels[2][i];
            labels[2][i] = temptwo;
        }


    }
}