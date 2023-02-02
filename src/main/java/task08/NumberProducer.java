package task08;

import java.util.Random;
import java.util.Scanner;
public class NumberProducer implements Producer {
    private int condition;

    public NumberProducer(int condition) {
        if (condition == 0 || condition == 1 ){
            this.condition = condition;
        }else {
            this.condition = -1;

        }

    }
    public  void produce() {
        if(condition == 1){
           randomNumber();

        } else if(condition ==0) {
           inputNumber();

        }else {
            System.out.println("Invalid input");
        }

    }

    private double randomNumber(){
        Random random = new Random();
        double number = random.nextDouble();
        return number;

    }
    private double inputNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        double number = input.nextInt();
        return number;

    }
}
