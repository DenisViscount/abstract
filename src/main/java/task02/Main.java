package task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter formula number");
        String input = scanner.next();

        if(input.equals("1")){
            LinearEquation linearEquation = new LinearEquation();
            System.out.println("X = " + linearEquation.evaluate(x));
        } else if (input.equals("2")) {
            QuadraticEquation quadraticEquation = new QuadraticEquation();
            System.out.println("X = " + quadraticEquation.evaluate(x));

        }else {
            CubicEquation cubicEquation = new CubicEquation();
            System.out.println("X = " + cubicEquation.evaluate(x));
        }


    }


}
