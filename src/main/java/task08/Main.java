package task08;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(1);
        Controller controller1 = new Controller(0);
        Controller controller2 = new Controller(3);
        controller2.produce();
        controller.produce();
        controller1.produce();

    }


}
