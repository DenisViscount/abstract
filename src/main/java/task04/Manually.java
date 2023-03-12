package task04;
import java.util.Scanner;
public class Manually {
    String [] arrayScanner;

    public String[] getArrayScanner() {
        return arrayScanner;
    }

    public Manually(String sizeArray) {
        int size = Integer.parseInt(sizeArray);
        arrayScanner = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input number " + i);
            Scanner scanner = new Scanner(System.in);

            arrayScanner[i] = scanner.next();

        }

    }
}
