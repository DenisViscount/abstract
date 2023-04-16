package task04_1;

public class GeneratorData {
    public static int [] generateData(int size, Source source) {
        int data[] = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = source.getData();
        }
        return data;
    }
}
