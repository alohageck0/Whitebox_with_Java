import java.util.HashMap;

public class Exercise {
    public static void main(String[] args) {
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
