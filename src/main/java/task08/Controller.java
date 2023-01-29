package task08;

import java.util.Random;
import java.util.Scanner;


public class Controller implements Producer {



    private int condition;

    public Controller(int condition) {
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

    private void randomNumber(){
        Random random = new Random();
        double randomNumber = random.nextDouble();
        System.out.println(randomNumber);

    }
    private void inputNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();
        System.out.println(number);

    }
}
