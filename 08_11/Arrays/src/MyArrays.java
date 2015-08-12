import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        int array[];
        int[] array1 = new int[23];

        array = new int[5];
        String str[];
        String[] str1 = new String[2];

        str1[0] = "Vlad";
        str1[1] = "Tony";
//        for (int i = 0; i < str1.length; i++) {
//            System.out.println(str1[i]);
//        }

        String[] family = {"Mama", "Papa"};
        int[] numbers = {1, 2, 3};

        String[] titles = {"War and Peace", "Farewell to Arms", "Hamlet"};
        String[] titles2 = {"War and Peace", "Farewell to Arms", "Hamlet"};
        if (Arrays.equals(titles, titles2)) {
            System.out.println("Arrays are equal");
        }
    }
}
