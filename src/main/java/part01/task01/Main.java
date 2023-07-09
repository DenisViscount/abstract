package part01.task01;

public class Main {
    public static void main(String[] args) {

        try {
            divideByZero();
        }
        catch (ArithmeticException e){
            System.out.println("An error occurred due to division by zero" + e.getMessage());
        }
    }


    public static void divideByZero(){
        int a = 10;
        int b = 0;
        int result = a/b;
    }
}
