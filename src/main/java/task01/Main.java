package task01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double sunExchange = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter currency (DOLLAR or EURO) ");

        Currency currency;
        CurrencyType currencyType;

        String input = scanner.next().toUpperCase();
        if (input.equals("EURO") | input.equals("DOLLAR")){

        }else {
            System.out.println("Invalid currency input");
            System.exit(0);
        }
        currencyType = CurrencyType.valueOf(input);

        if (currencyType == CurrencyType.DOLLAR) {
            currency = new Dollar();

            System.out.println(sunExchange + " Dollars = " + currency.exchange(sunExchange) + " rubles");

        } else {
            currency = new Euro();
            System.out.println(sunExchange + " Euro = " + currency.exchange(sunExchange) + " rubles");
        }

    }
}
