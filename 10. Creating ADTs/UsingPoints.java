import java.util.Arrays;

public class UsingPoints {

    public static void main(String[] args) {

        Point p1 = new Point(2.0, 3.0);
        Point p2 = new Point();

        double dist1 = p1.distanceFromOrigin();
        double dist2 = p2.distanceFromOrigin();

        System.out.println("P1 distance from origin = " + dist1);
        System.out.println("P2 distance from origin = " + dist2);

        double coord1 = p2.getX();
        System.out.println("P2 x coordinate = " + coord1);

        double distance1 = p1.distanceTo(p2);
        System.out.println("Distance from P1 to P2 = " + distance1);

        Point pA = new Point(2.0, 2.0);
        Point pB = new Point(2.0, 2.0);

        System.out.println(pA == pB);
        System.out.println(pA.equals(5));

        

        int[] a = {1, 2, 3, 4};
        System.out.println(Arrays.toString(a));
        





        
    }
}