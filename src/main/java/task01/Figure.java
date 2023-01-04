package task01;

public abstract class  Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


    public abstract double perimeter();
    public abstract double square();
    public abstract String color();
    public abstract double diagonal();



}
