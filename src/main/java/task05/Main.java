package task05;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle(5);
        Figure circle1 = new Circle(10);
        Figure square = new Square(11);
        Figure square1 = new Square(8);
        Figure triangle = new Triangle(3,8,6);
        Figure triangle1 = new Triangle(4,6,9);

        Figure [] figures = new Figure[] {circle1,circle,square,square1,triangle,triangle1};

       double totalPerimeter =  totalPerimeter(figures);
        System.out.println(totalPerimeter);
        double totalSquare = totalSquare(figures);
        System.out.println(totalSquare);




    }
    public static double totalPerimeter(Figure[] figures){

        double totalPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            totalPerimeter = totalPerimeter + figures[i].perimeter();

        }

        return totalPerimeter;
    }
    public static double totalSquare(Figure [] figures){
        double totalSquare = 0;
        for (int i = 0; i < figures.length; i++) {
            totalSquare = totalSquare + figures[i].square();


        }

        return totalSquare;

    }
}
