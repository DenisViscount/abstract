package task09;

public class Main {

    public static void main(String[] args) {

        String str = "f1ds125t1 6q1f1";
        char [] array = str.toCharArray();
        int count = 0;

        for (int i = 0; i < array.length; i++) {


            if('1' == array[i] ) {
                count++;
            }

        }
        System.out.println(count);
    }

}
