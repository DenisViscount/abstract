package task02;

public class Dollar extends Currency {

    public Dollar(double price) {
        super(price);

    }

    @Override
    public double currencyExchange(double transferAmount) {
        return  transferAmount * getPrice();
    }
}

