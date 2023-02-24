package task04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pet pet;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("dog")){
            pet = new Dog();
        } else if (input.equals("cat")){
            pet = new Cat();
        } else {
            pet = new Fish();

        }
        Human human = new Human("Bob",50,pet);
        System.out.println(human);
    }


}
