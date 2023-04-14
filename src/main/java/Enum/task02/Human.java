package Enum.task02;

public class Human {
    private String name;
    private int age;
    private Gender gender;

    public Human(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String toString() {
        return "Human{" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", gender: " + gender +
                '}';
    }
}
