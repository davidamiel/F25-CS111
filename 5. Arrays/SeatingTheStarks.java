public class SeatingTheStarks {

    public static void main(String[] args) {

        String[] starks = {"Sansa", "Eddard", "Arya", "Bran", "Lyanna", "Robb", "Catelyn", "Benjen"};

        int seatsPerRow = Integer.parseInt(args[0]);
        int rows = (int) Math.ceil((double) starks.length / seatsPerRow);
        String[][] room = new String[rows][seatsPerRow];

        int index = 0;
        // fill in row-major order
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seatsPerRow; j++) {
                if (index < starks.length) {
                    room[i][j] = starks[index++];
                } else {
                    room[i][j] = "---"; // empty seat
                }
            }
        }

        // print seating chart
        System.out.println("Seating chart:");
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j < seatsPerRow; j++) {
                System.out.print(room[i][j] + "\t");
            }
            System.out.println();
        }
    }
}