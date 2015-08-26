import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)

public class FinalDDT {
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
        calculator.switchON();
    }

    @Test
    @FileParameters(value = "file:/Users/royalfiish/IdeaProjects/Mango/data.csv",
            mapper = CsvWithHeaderMapper.class)


    public void Final(int x, String operand, int y, int Expected) {

        calculator.add(x);
        switch (operand) {
            case "+":
                calculator.add(y);
                break;
            case "-":
                calculator.subtract(y);
                break;
            case "*":
                calculator.multiply(y);
                break;
        }
        assertEquals(Expected, calculator.getResult());
    }
}
