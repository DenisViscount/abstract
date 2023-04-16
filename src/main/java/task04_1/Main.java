package task04_1;

public class Main {

    public static void main(String[] args) {

        int[] randomData = GeneratorData.generateData(5,new RandomDataSource());
        System.out.println("Random data: ");
        for (int i = 0; i < randomData.length; i++) {
            System.out.println(randomData[i]);
            
        }
        int [] scannerData = GeneratorData.generateData(5,new ScannerDataSource());
        System.out.println("Scanner data: ");
        for (int i = 0; i < scannerData.length; i++) {
            System.out.println(scannerData[i]);

        }



    }

}
