package tasc03;

public abstract class Director {
    private String name;
    private int age;
    private int workExperience;

    public Director(String name, int age, int workExperience) {
        this.name = name;
        this.age = age;
        this.workExperience = workExperience;
    }

    public abstract void makeReport();


}
