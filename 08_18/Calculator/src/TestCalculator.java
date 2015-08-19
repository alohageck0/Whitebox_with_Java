public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.switchON();
        calculator.add(1);
        calculator.add(1);
        if (calculator.getResult() == 2) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
