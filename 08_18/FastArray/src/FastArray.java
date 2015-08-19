import java.util.HashMap;

public class FastArray {
    public static void main(String[] args) {
//        HashMap<String, String> hashMap = new HashMap<String, String>();
//        hashMap.put("Apple", "red");
//        hashMap.put("Orange", "orange");
//        hashMap.put("Banana", "yellow");
//        System.out.println(hashMap.size());
//        System.out.println(hashMap.get("Banana"));
        String name = "Java Java C++ Python Java Ruby C#";
        String[] langs = name.split(" ");
        HashMap<String, Integer> langsH = new HashMap<String, Integer>();
        for (int i = 0; i < langs.length; i++) {
            if (!langsH.containsKey(langs[i])) {
                langsH.put(langs[i], 1);
            } else {
                langsH.put(langs[i], langsH.get(langs[i]) + 1);
            }
        }
        System.out.println(langsH);
    }
}
