package task01;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Black",2.5);
        String color = circle.color();
        System.out.println("circle color: " + color);
       double perimeter = circle.perimeter();
        System.out.println("perimeter circle = " + perimeter);
       double square = circle.square();
        System.out.println("square circle = " + square);
        double diagonal = circle.diagonal();
        System.out.println("diagonal circle = " + diagonal);

    }
}
