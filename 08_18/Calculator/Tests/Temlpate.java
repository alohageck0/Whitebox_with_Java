import org.junit.*;

public class Temlpate {
    @BeforeClass
    public static void oneTimeSetUp() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public static void oneTimeTeardown() {
        System.out.println("AfterClass");
    }

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
