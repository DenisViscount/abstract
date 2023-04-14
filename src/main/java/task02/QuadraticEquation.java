package task02;

public class QuadraticEquation implements Polynomial {
    public double evaluate(int x) {
        return Math.pow(x,2) + x + 1;
    }
}
