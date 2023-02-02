package task02;

public abstract class Currency {
    private double price;


    public Currency(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

   

    public abstract double currencyExchange(double transferAmount);
}
