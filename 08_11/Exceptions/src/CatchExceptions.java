
public class CatchExceptions {
    public static void main(String[] args) {
        int i = 4;
        int j = 0;
        try {
            switch (i) {
                case 1:
                    System.out.println(i / j);
                case 2:
                    int[] arr = new int[2];
                    i = arr[9];
                case 3:
                    String str = "abc";
                    char ch = str.charAt(99);
            }
            System.out.println("Ending try block");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
