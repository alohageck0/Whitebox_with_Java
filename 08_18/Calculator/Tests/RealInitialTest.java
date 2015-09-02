import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RealInitialTest {
    public Calculator calculator;
    public int x;
    public int y;
    public int Expected;

    @Before
    public void setup() {
        calculator = new Calculator();
        calculator.switchON();
    }

//    @Test
//    public void testAdd(int x, int y, int Expected) {
//        calculator.add(x);
//        calculator.add(y);
//        assertEquals(Expected, calculator.getResult());
//    }

    @Test
    public void testAdd2() {
        calculator.add(-1);
        calculator.add(-4);
        assertEquals(-5, calculator.getResult());
    }

    public void testMult() {
        calculator.add(10);
        calculator.multiply(4);
        assertEquals("Multiplication 10x4", 40, calculator.getResult());
    }

    @Ignore
    @Test
    public void testMultiply() {
//        assertEquals(5, 5);
    }

}
