
public class Ractangle {
    private int a;
    private int b;
    private Point coords;

    public Ractangle(int aa, int bb, double xx, double yy) {
        a = aa;
        b = bb;
        coords = new Point(xx, yy);
    }

    public double square() {
        return a * a + b * b;
    }

//    public boolean allcoords() {
//        double[][] arr = new double[4][2];
//        arr[0][0] = coords.x;
//        arr[0][1] = coords.y;
//        arr[1][0] = coords.x;
//        arr[1][1] = coords.y + a;
//        arr[2][0] = coords.x + b;
//        arr[2][1] = coords.y;
//        arr[3][0] = coords.x + a;
//        arr[3][1] = coords.y + b;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        return true;
//    }
}
