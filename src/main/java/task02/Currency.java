package task02;

public abstract class Currency {
    private double price;
    public double convertToRubles;

    public Currency(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double currencyExchange(double convertToRubles);
}
