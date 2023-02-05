package task05;

public class Human implements Walkable, Jumpable {
    private int speed;
    public Human(){

    }

    public Human(int speed) {
        this.speed = speed;
    }

    public void jump() {
        System.out.println("I'm jumped to the top: " + Jumpable.HEIGHT);

    }

    public void walk() {
        int humanSpeed;
        if (this.speed == 0){
            humanSpeed = Walkable.DEFAULT_HEIGHT;

        }else humanSpeed = this.speed;
        System.out.println("I'm walked with speed = " + humanSpeed);

    }

}
