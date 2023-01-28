package task07;

public class Pump implements State {
    public void on() {
        System.out.println("Pump is on");
    }

    public void off() {
        System.out.println("Pump is off");

    }
}
