import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RealInitialTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        calculator.switchON();
        calculator.add(1);
        calculator.add(1);
        assertEquals(2, calculator.getResult());
    }

    @Test
    public void testAdd2() {
        Calculator calculator = new Calculator();
        calculator.switchON();
        calculator.add(-1);
        calculator.add(-4);
        assertEquals(-5, calculator.getResult());
    }

}
