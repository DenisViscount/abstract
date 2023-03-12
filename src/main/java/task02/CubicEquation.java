package task02;

public class CubicEquation extends Equation {

    public double evaluate(int x) {
        return Math.pow(x,3) + Math.pow(x, 2) + x + 1;
    }
}
