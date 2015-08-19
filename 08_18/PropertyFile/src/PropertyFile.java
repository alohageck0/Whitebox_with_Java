import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/royalfiish/IdeaProjects/Mango/08_18/pair.txt"));
        String name = properties.getProperty("firstName");
        System.out.println(name);
    }
}
