package task01;

public class Euro extends Currency{
    final double RATE = 90;



    @Override
    public double exchange(double sunExchange) {
        return RATE * sunExchange;
    }
}
