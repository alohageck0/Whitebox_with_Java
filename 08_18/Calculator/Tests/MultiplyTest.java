import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MultiplyTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        calculator.switchON();
    }

    @Test
    public void testSub() {
        calculator.add(10);
        calculator.multiply(4);
        assertEquals("Multiplication 10x4", 40, calculator.getResult());
    }

    @Test
    public void testSub2() {
        calculator.add(10);
        calculator.multiply(4);
        assertTrue("Multiplication 10x4", 40 == calculator.getResult());
        assertTrue(true);
    }
}
