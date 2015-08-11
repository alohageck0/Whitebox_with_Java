
public class Ractangle extends Point {
    private int a;
    private int b;
    private Point coords;

    public Ractangle(int aa, int bb, double xx, double yy) {
        super(xx, yy);
        a = aa;
        b = bb;
        coords = new Point(xx, yy);
    }

    public double square() {
        return a * a + b * b;
    }

//    public boolean allcoords() {
//
//    }
}
