import java.util.HashMap;

public class FastArray {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Apple", "red");
        hashMap.put("Orange", "orange");
        hashMap.put("Banana", "yellow");
        System.out.println(hashMap.size());
        System.out.println(hashMap.get("Banana"));
    }
}
