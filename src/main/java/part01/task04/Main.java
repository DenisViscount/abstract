package part01.task04;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            throwException1();
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

    }

    public static void throwException() throws Exception {
        try {

            String str = null;
            System.out.println(str.length());

            int[] arr = new int[5];
            System.out.println(arr[10]);

            throw new IOException("Example of checked exception");
        } catch (NullPointerException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (Exception ex) {
            throw ex;
        }
    }

    public static void throwException1() throws Exception {
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