public class CircleFunctions {

    // Function 1 - getRadius
    // Gets the radius of a circle from the user as an integer from the command line.
    public static int getRadius() {
        StdOut.println("Please enter a radius: ");
        int rad = StdIn.readInt();
        return rad;
    }

    // Function 2 - calculateArea
    // Takes an integer radius and returns the area of that circle
    public static double calculateArea(int r) {
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }

    // Function 3 - calculateCircumference
    public static double calculateCircuference(int rad) {
        return (2 * Math.PI * rad);
    }

}