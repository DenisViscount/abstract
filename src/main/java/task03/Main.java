package task03;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Pet dog = new Dog();
        Fish fish = new Fish();

        petVoice(cat);
        petVoice(dog);
        petVoice(fish);


    }
    public static void petVoice(Pet pet){
        pet.say();


    }
}
