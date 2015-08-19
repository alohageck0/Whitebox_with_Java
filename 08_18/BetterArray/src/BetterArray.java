import java.util.ArrayList;

public class BetterArray {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ann");
        names.add("Cindy");
//        System.out.println(names);
        names.add(1, "Bob");
        names.remove(0);
        System.out.println(names);
        names.set(0, "Bill");
        String name = names.get(1);
        System.out.println(name);
        System.out.println(names.size());
    }
}
