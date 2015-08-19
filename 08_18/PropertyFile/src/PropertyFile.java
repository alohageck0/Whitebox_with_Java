import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/royalfiish/IdeaProjects/Mango/08_18/test"));
        String name = properties.getProperty("first");
        System.out.println(name);
    }
}
