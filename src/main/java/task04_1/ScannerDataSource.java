package task04_1;

import java.util.Scanner;

public class ScannerDataSource implements Source {
    private final Scanner scanner;


    public ScannerDataSource() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int getData() {
        System.out.println("Enter numbers: ");
        return scanner.nextInt();
    }


}
