package task08;

public class Main {
    public static void main(String[] args) {
        NumberProducer numberProducer = new NumberProducer(1);
        NumberProducer numberProducer1 = new NumberProducer(0);
        NumberProducer numberProducer2 = new NumberProducer(3);
        numberProducer2.produce();
        numberProducer.produce();
        numberProducer1.produce();

    }


}
