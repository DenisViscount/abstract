package task02;

public class Euro extends Currency {

    public Euro(double price) {
        super(price);

    }

    @Override
    public double currencyExchange(double transferAmount) {
        return transferAmount * getPrice();
    }
}
