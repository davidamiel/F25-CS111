public class ManyCircles {
    public static void printArray(double[] arr) {
        StdOut.println();
        for(double num : arr) {
            StdOut.print(num + " ");
        }
    }
    // getRadii - read doubles from the command line (or standard input), 
    // put them into a double[], and return that double[].
    public static double[] getRadii() {
        double[] numbers = StdIn.readAllDoubles();
        return numbers;
    }
    public static double calculateArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    // calculateManyAreas - accept one double[] of radii. 
    // creates and returns a double[] that contains the areas of the circles
    // areas[i] = the area of the circle with radius radius[i]
    public static double[] calculateManyAreas(double[] radii) {
        double[] areas = new double[radii.length];
        for(int i = 0; i < areas.length; i++) {
            areas[i] = calculateArea(radii[i]); 
        }
        return areas;
    }
    public static void main(String[] args) {
        double[] radiuses = getRadii();
        StdOut.println("Radii: ");
        printArray(radiuses);

        double[] areas = calculateManyAreas(radiuses);
        StdOut.println();
        StdOut.println("Areas: ");
        printArray(areas);
    }




    



    
    
}
