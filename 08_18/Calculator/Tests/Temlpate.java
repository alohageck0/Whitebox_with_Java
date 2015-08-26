import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Temlpate {
    @Before
    public void setUp() {
        System.out.println("Before");
    }

    @Test
    public void test1() {
        System.out.println("Test1");
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }

    @After
    public void tearDown() {
        System.out.println("After");
    }
}
