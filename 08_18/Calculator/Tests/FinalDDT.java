import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FinalDDT {
    public Calculator calculator;

    @FileParameters(value = "file:/Users/royalfiish/IdeaProjects/Mango/data.csv",
            mapper = CsvWithHeaderMapper.class)
    @Before
    public void setup() {
        calculator = new Calculator();
        calculator.switchON();
    }

    @Test
    public void Final(String x, String operand, String y, String Expected) {

        switch (operand) {
            case "+":
                calculator.add(x);
                calculator.add(y);
                assertEquals(Expected, calculator.getResult());
            case "-":
                calculator.add(x);
                calculator.subtract(y);
                assertEquals(Expected, calculator.getResult());
            case "*":
                calculator.add(x);
                calculator.multiply(y);
                assertEquals("Multiplication 10x4", Expected, calculator.getResult());
        }
    }
}
