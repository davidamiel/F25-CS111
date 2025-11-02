public class SingleCircles {

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
    public static void calculateCircuference(int rad) {
        double circ = (2 * Math.PI * rad);
        System.out.println(circ);
    }

    public static void main(String[] args) {
        double hi = 3.0;
        calculateCircuference((int) hi);

    }

}