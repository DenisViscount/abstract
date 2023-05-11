package task08;

public class Main {

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "agcd";
        String str3 = "ergl";

        if (str1.compareTo(str2) < 0) {
            if (str1.compareTo(str3) < 0) {
                System.out.println(str1);
                if (str2.compareTo(str3) < 0) {
                    System.out.println(str2);
                    System.out.println(str3);
                } else {
                    System.out.println(str3);
                    System.out.println(str2);
                }
            } else {
                System.out.println(str3);
                System.out.println(str1);
                System.out.println(str2);
            }
        } else {
            if (str2.compareTo(str3) < 0) {
                System.out.println(str2);
                if (str1.compareTo(str3) < 0) {
                    System.out.println(str1);
                    System.out.println(str3);
                } else {
                    System.out.println(str3);
                    System.out.println(str1);
                }
            } else {
                System.out.println(str3);
                System.out.println(str2);
                System.out.println(str1);
            }
        }
    }


}


