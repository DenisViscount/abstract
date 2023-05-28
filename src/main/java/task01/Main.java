package task01;

//Написать метод, в котором возникает ArithmeticException.
// Обработать исключение. Написать блок finally

public class Main {
    public static void main(String[] args) {
        double a = -5;
        //sqrt(1);
        sqrt(a);



    }

    public static double sqrt(double a) {
        double sqrt = 0;
        try {
            sqrt = Math.sqrt(a);
        } catch (ArithmeticException e) {
            System.out.println("Invalid variable");

        }
        finally {
            System.out.println(sqrt);

        }

        return sqrt;
    }
}
