package task06;

public class Spaceship implements ControlPanel {
    int speed;
    int flightAngle;
    public void increaseSpeed(double speedChange) {
        System.out.println("Speed increased by: " + speed + speedChange );
    }

    public void slowDown(double speedChange) {
        System.out.println("Speed slow down by: " + speedChange);

    }

    public void flightAngleChange(double angleChange) {
        System.out.println("Flight angle changed by: " + angleChange);

    }
}
