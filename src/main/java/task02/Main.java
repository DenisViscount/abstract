package task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 20;
        Equation equation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter formula number");
        String input = scanner.next();

        if(input.equals("1")){
            equation = new LinearEquation();
            System.out.println("X = " + equation.evaluate(x));
        } else if (input.equals("2")) {
            equation = new QuadraticEquation();
            System.out.println("X = " + equation.evaluate(x));

        }else {
            equation = new CubicEquation();
            System.out.println("X = " + equation.evaluate(x));
        }


    }


}
