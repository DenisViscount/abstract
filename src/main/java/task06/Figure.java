package task06;

public abstract class Figure {
    public static int count;
    public Figure() {
        count ++;

    }

    abstract double square();
}
