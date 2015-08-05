/**
 * Created by royalfiish on 8/4/15.
 */
public class Point {
    private double x;
    private double y;

    public static double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    public Point(double xx, double yy) { //constructor
        x = xx;
        y = yy;
    }
}
