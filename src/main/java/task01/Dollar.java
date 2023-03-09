package task01;

public class Dollar extends Currency{
    final double RATE = 85;

    @Override
    public double exchange(double sunExchange) {
        return RATE * sunExchange;
    }
}
