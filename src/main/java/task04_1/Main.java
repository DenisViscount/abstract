package task04_1;

public class Main {
   static public int [] generateData(int size, Source source){
        int data [] = new int [size];
        for (int i = 0; i < size; i++) {
            data[i] = source.getData();


        }
        return data;
    }
    public static void main(String[] args) {
        int[] randomData = generateData(5,new RandomDataSource());
        System.out.println("Random data: ");
        for (int i = 0; i < randomData.length; i++) {
            System.out.println(randomData[i]);
            
        }
        int [] scannerData = generateData(5,new ScannerDataSource());
        System.out.println("Scanner data: ");
        for (int i = 0; i < scannerData.length; i++) {
            System.out.println(scannerData[i]);

        }



    }

}
