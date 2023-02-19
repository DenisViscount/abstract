package task02;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog();
        Pet cat = new Cat();
        Fish fish = new Fish();
        Human human = new Human("Mike",20,dog);
        Human human1 = new Human("Don",18,cat);
        Human human2 = new Human("Raf",25,fish);
        human.pat();
        human1.pat();
        human2.pat();
    }
}
