package task04;

public class Random {
    String [] arrayRandom ;

    public String[] getArrayRandom() {
        return arrayRandom;
    }

    public Random(String sizeArray) {
       int size = Integer.parseInt(sizeArray);
       arrayRandom = new String[size];
        for (int i = 0; i < size; i++) {
            arrayRandom[i] = String.valueOf((int)(Math.random() * size));

        }

    }
}
