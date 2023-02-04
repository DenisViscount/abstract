package task05;

public class Human implements Walkable, Jumpable {
    private int speed;

    public void jump() {
        System.out.println("I'm jumped to the top: " + Jumpable.HEIGHT);

    }

    public void walk() {
        System.out.println("I'm walked with speed = " + Walkable.SPEED);

    }
}
