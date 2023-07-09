package part01.task05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            throwExceptions();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            throwExceptions1();
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void throwExceptions() throws Exception {
        try {
            String str = null;
            System.out.println(str.length());

            int[] arr = new int[5];
            System.out.println(arr[10]);

            throw new IOException("Example of checked exception");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (Exception e) {
            throw e;
        }
    }

    public static void throwExceptions1() throws Exception {
        try {

            String str = null;
            System.out.println(str.length());


            int[] arr = new int[5];
            System.out.println(arr[10]);


            throw new IOException("Example of checked exception");
        } catch (Exception e) {
            throw e;
        }
    }
}
