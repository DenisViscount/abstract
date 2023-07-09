package part01.task03;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            doSomething();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
            throw e;
        }
    }

    public static void doSomething() throws Exception {
        try {
            int a = 5;
            int b = 0;
            int result = a/b;
        }
        catch (Exception e){
            System.out.println("Example of an exception" + e.getMessage());
            throw e;
        }


    }
}
