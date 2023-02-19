package task03;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Pet dog = new Dog();
        Fish fish = new Fish();
        Human human = new Human();
        human.pat(cat);
        human.pat(dog);
        human.pat(fish);

    }
}
