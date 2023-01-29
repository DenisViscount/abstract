package task01;

public class Square extends Figure {
    final int NUMBER_OF_SIDE = 4;
    private  int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double perimeter() {
        return side * NUMBER_OF_SIDE;
    }

    @Override
    public double square() {
        return side * side;
    }

    @Override
    public String color() {
        return getColor();
    }

    @Override
    public double diagonal() {
        return Math.sqrt(2) * side;
    }
}
