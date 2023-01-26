package task05;

public class Human implements Walkable, Jumpable {


    public void jump() {
        System.out.println("I'm jumped to the top: " + height);

    }

    public void walk() {
        System.out.println("I'm walked with speed = " + speed);

    }
}
