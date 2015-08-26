import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractionTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        calculator.switchON();
    }

    @Test
    public void testSub() {
        calculator.add(100);
        calculator.subtract(15);
        assertEquals(85, calculator.getResult());
    }
}
