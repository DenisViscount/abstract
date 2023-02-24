package task04;

public class Human {
    private String name;
    private int age;
    private Pet pet;

    public Human(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name: " + name + '\'' +
                ", age: " + age +
                ", pet:" + pet +
                '}';
    }
}
