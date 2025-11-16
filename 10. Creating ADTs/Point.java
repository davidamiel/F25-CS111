public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }


    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distanceTo(Point p) {
        double x1 = this.x;
        double x2 = p.getX();
        double y1 = this.y; // this.getY();
        double y2 = p.getY();
        // return sqrt((x1-x2)^2 + (y1-y2)^2)
        double dist = Math.sqrt(Math.pow((x1 - x2), 2) +Math.pow((y1 - y2), 2));
        return dist;
    }

    public boolean equals(Point p) {
        boolean sameX = Double.compare(this.x, p.getX()) == 0;
        boolean sameY = Double.compare(this.y, p.getY()) == 0;
        return sameX && sameY;
        // 
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }










    public void setX(double newX) {
        this.x = newX;
    }

    public void setY(double newY) {
        this.y = newY;
    }

    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    
}
