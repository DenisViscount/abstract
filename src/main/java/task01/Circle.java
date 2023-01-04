package task01;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double square() {
        return Math.PI * radius*radius;
    }

    @Override
    public String color() {

        return getColor();
    }

    @Override
    public double diagonal() {
        return 2 * radius;
    }
}
