import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RealInitialTest {
    public Calculator calculator;

    @Before
    public void setup() {
        Calculator calculator = new Calculator();
        calculator.switchON();
    }

    @Test
    public void testAdd() {
        calculator.add(1);
        calculator.add(1);
        assertEquals(2, calculator.getResult());
    }

    @Test
    public void testAdd2() {
        calculator.add(-1);
        calculator.add(-4);
        assertEquals(-5, calculator.getResult());
    }

}