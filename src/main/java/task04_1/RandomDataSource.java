package task04_1;

import java.util.Random;

public class RandomDataSource implements Source {
    private final Random random;

    public RandomDataSource() {
        this.random = new Random();
    }

    @Override
    public int getData() {
        return random.nextInt(11);
    }
}
