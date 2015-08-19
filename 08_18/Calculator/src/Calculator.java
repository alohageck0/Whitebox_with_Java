public class Calculator {
    private int result;

    public void switchON() {
        result = 0;
    }

    public void add(int a) {
        result += a;
    }

    public int getResult() {
        return result;
    }
}
