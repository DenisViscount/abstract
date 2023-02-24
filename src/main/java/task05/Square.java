package task05;

public class Square extends Figure{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
   public double perimeter() {
        return side + side + side + side;
    }

    @Override
    double square() {
        return side * side;
    }
}
