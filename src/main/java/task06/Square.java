package task06;


public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }


    @Override
    double square() {
        return side * side;
    }
}
