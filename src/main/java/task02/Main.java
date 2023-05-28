package task02;
//Написать методы, в которых может возникнуть ArrayIndexOutOfBoundsException
// и NullPointerException. Обработать их с помощью механизма исключений
public class Main {
    public static void main(String[] args) {
        int length = 5;
        int b = -5;
        int count = 6;
        creationArray(length,b,count);

    }
    public static void creationArray(int length, int b,int count) {
        String[] arr = new String[length];
        try {


            String str = null;
            for (int i = 0; i < arr.length; i++) {
                if (b > 0) {
                    arr[i] = String.valueOf(i + 1);

                } else {
                    arr[i] = null;
                }
                str = arr[i].toUpperCase();
            }

            System.out.println(arr[count]);
            System.out.println(str);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index in array");
        } catch (NullPointerException ex) {
            System.out.println("Object is null");
        }
    }

}
