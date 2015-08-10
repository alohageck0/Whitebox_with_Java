
public class Point {
    public double x;
    public double y;

    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public Point(double xx, double yy) { //constructor
        x = xx;
        y = yy;
    }
}
