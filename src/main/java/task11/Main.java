package task11;

public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        String reverseString = reverseString(str);
        System.out.println(reverseString);

    }

    public static String reverseString(String str){
        int n = str.length();
        char [] temp = new char[n];

        for (int i = 0; i < n; i++) {
            temp[n -i -1] = str.charAt(i);

        }

        return String.valueOf(temp);
    }
}
