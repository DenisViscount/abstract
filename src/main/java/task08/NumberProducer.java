package task08;

import java.util.Random;
import java.util.Scanner;
public class NumberProducer implements Producer {
    private double condition;

    public NumberProducer(int condition) {
        if (condition == 0 || condition == 1 ){
            this.condition = condition;
        }else {
            this.condition = -1;
            System.out.println("Wrong state, please change it");

        }

    }
    public double  produce() {
        if(condition == 1){
         return  randomNumber();

        } else if(condition ==0) {
           return inputNumber();


        }
        return Double.NaN;
    }

    private double randomNumber(){
        Random random = new Random();
        return random.nextDouble();


    }
    private double inputNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        return input.nextInt();


    }
}
