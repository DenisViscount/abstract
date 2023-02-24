package task05;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
   public double perimeter() {
        return 2 * Math.PI * radius;

    }

    @Override
    double square() {
        return Math.PI * (radius * radius);

    }
}
