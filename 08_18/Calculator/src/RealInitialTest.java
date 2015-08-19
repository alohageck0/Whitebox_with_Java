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

}
