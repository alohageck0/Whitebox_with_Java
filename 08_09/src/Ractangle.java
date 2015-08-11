
public class Ractangle extends Point {
    private int a;
    private int b;
    private Point coords1;

    public Ractangle(int aa, int bb, double xx, double yy) {
        super(xx, yy);
        a = aa;
        b = bb;
        coords1 = new Point(xx, yy);
    }

    public double square() {
        return a * b;
    }

    public String allCoordsString() {
        Point coord2 = new Point(coords1.x, coords1.y + b);
        Point coord3 = new Point(coords1.x + a, coords1.y + b);
        Point coord4 = new Point(coords1.x + a, coords1.y);
        String coords = coords1.getCoords() + ',' + coord2.getCoords()+','+coord3.getCoords()+','+coord4.getCoords();
        return coords;
    }
}
