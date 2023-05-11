package task01;

public class Main {
    public static void main(String[] args) {
        String str = "af?,4f.e2eq";
        iteration(str);
    }
    public static void iteration(String str) {

        char newStr = 0;
        for (int i = 0; i < str.length(); i++) {
            newStr = str.charAt(i);
            System.out.println(newStr);

        }

    }

}
