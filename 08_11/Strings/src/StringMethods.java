public class StringMethods {
    public static void main(String[] args) {
        String name = new String("Tony");
        String name1 = "Tony";
        System.out.println("Hello, " + name);
//        System.out.println("Hello, " + name1);
        char achar = name.charAt(3);
//        System.out.println(achar);
        int lenght = name.length();
        int index = name.indexOf('y');
        System.out.println("Position of y is " + index);
        String lang = "Java";
        String lang2 = "Java";
        if (lang.equals(lang2)) {
            System.out.println("==: Are equal");
        }

    }
}
