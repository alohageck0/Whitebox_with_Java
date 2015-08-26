import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        calculator.switchON();
    }
    @After
    public void teardown(){
        calculator.switchON();
    }

    @Test
    public void testSub() {
        calculator.add(10);
        calculator.multiply(4);
        assertEquals(40, calculator.getResult());
    }
}
