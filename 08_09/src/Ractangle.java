
public class Ractangle extends Point {
    private int a;
    private int b;
    private Point coord1;
    private Point coord2;
    private Point coord3;
    private Point coord4;

    public Ractangle(int aa, int bb, double xx, double yy) {
        super(xx, yy);
        a = aa;
        b = bb;
        coord1 = new Point(xx, yy);
        coord2 = new Point(coord1.x, coord1.y + b);
        coord3 = new Point(coord1.x + a, coord1.y + b);
        coord4 = new Point(coord1.x + a, coord1.y);

    }

    public double square() {
        return a * b;
    }

    public String allCoordsString() {
        String coords = coord1.getCoords() + ',' + coord2.getCoords() + ',' + coord3.getCoords() + ',' + coord4.getCoords();
        System.out.println(coords);
        return coords;
    }
}
