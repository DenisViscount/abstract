package task04;
//Написать метод, который принимает время начала (одно целое число) и время конца оповещения.
// Предусмотреть исключительные (ошибочные) ситуации.
// В случае ошибочной ситуации бросить исключение с соответствующим сообщением
public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        try {
            int start = -6;
            int end = -10;
            hronos(start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        }
    }


    public static void hronos(int start, int end){
        if(start < 0 | end < 0){
            throw new IllegalArgumentException("Invalid argument");
        }
        if(start > end){
            throw new IllegalArgumentException("Invalid argument");
        }
        System.out.println("Start of notification: " + start);
        System.out.println("End of notification: " + end);
    }





}


