public class Practice {
    public static void main(String[] args) {
        String sentence = "I like to learn Java";
        for (int i = 0; i < sentence.length(); i++) {
            System.out.print(sentence.charAt(sentence.length() - 1 - i));
        }
        System.out.println();
        String name = "Evgenii Iavorovich";
        int space = name.indexOf(" ");
        System.out.println(name.charAt(0) + " " + name.charAt(space + 1));


    }
}
