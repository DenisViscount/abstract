package Enum.task05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String inputName = scanner.nextLine();
        System.out.println("Enter age: ");
        int inputAge = scanner.nextInt();
        System.out.println("Enter gender MALE/FEMALE: ");
        String inputGender = scanner.next().toUpperCase();
        Gender gender = null;

        Gender[] genders = Gender.values();
        for (int i = 0; i < genders.length; i++) {
            if(genders[i].toString().equals(inputGender)){
                gender = genders[i];
                break;
            }
        }
        if (gender == null){
            System.out.println("Некорректный ввод пола");
            return;
        }
        Human human = new Human(inputName,inputAge,gender);
        System.out.println("Human created: " + human.toString());

    }
}
