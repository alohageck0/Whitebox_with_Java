/**
 * Created by royalfiish on 7/28/15.
 */
public class Debug {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        boolean result = checkIsDouble(a, b);
        System.out.println("The result is " + result);
    }

    public static boolean checkIsDouble(int a, int b) {
        if (a * 2 == b)
            return true;
        else
            return false;
    }

}
