package task06;

public class Main {
    public static void main(String[] args) {
        Figure [] figures = {new Square(2),new Square(5),new Square(6)};
        Figure [] figures1 = {new Triangle(4,4,2.5),new Triangle(4,6,3),new Triangle(5,6,3)};
        Figure [] figures2 = {new Circle(2),new Circle(5),new Circle(3)};

        Figure [][] arrayFigures = {figures, figures1, figures2};

       double totalArrayFigures = Calculator.totalArea(arrayFigures);
        System.out.println(totalArrayFigures);











    }
}
