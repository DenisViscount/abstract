package Enum.task01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter airplane state : PARKING, RISEN, FLIGHT, LANDING or STOP");
        String input = scanner.next().toUpperCase();

        Airplane airplane = new Airplane("Tu - 104");


        if (input.equals("PARKING")) {
            airplane.parking();

        } else if (input.equals("RISEN")) {
            airplane.risen();
        } else if (input.equals("LANDING")) {
            airplane.landing();
        } else {
            airplane.flight();
        }



    }
}
