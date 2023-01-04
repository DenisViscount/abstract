package task02;

public class Main {
    public static void main(String[] args) {
        Dollar dollar = new Dollar(65.78);
        double rubles = dollar.currencyExchange(123.8);
        System.out.println(rubles);
    }
}
