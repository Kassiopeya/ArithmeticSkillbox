public class Arithmetic {
    int x = 0;
    int y;

    public Arithmetic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int sum() {
        int sum = x + y;
        return sum;
    }

    public int multiply() {
        int multiply = x * y;
        return multiply;
    }

    public int maxValue() {
        if (x > y) {
            return x;
        }
        return y;
    }

    public int minValue() {
        if (x < y) {
            return x;
        }
        return y;
    }
}
