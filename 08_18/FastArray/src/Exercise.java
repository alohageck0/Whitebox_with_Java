import java.util.HashMap;

public class Exercise {
    public static void main(String[] args) {
        String name = "Java Java C++ Python Java Ruby C#";
        String[] langs = name.split(" ");
        HashMap<String, Integer> langsH = new HashMap<String, Integer>();
        for (String lang : langs) {
            if (!langsH.containsKey(lang)) {
                langsH.put(lang, 1);
            } else {
                langsH.put(lang, langsH.get(lang) + 1);
            }
        }
        System.out.println(langsH);
        System.out.println("Number of unique words " + langsH.size());
        System.out.println("Number of repeated words " + (langs.length - (langsH.size() - 1)));
    }
}
