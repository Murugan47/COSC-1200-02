public class Calculator {
    public int add(int a, int b) {
        int c = a + b;
        return c;

    }

    public int subtract(int a, int b) {

        int c = a - b;
        return c;

    }

    public int multiply(int a, int b) {

        int c = a * b;
        return c;

    }

    public int divide(int a, int b) {

        if (b > 0 || b < 0) {
            int c = a/b;
            return c;
        } else {
            return a;
        }

    }
}
