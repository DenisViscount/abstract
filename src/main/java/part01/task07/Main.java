package part01.task07;

public class Main {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (RuntimeException e) {

            String message = e.getMessage();
            Throwable cause = e.getCause();

            System.out.println("Сообщение исключения: " + message);
            System.out.println("Причина (cause) исключения: " + cause);


        }
    }

    public static void divideByZero() {
        int a = 5;
        int b = 0;

        try {
            int result = a / b;
        } catch (ArithmeticException e) {

            throw new CustomRuntimeException("Деление на ноль", e);
        }

    }
}
