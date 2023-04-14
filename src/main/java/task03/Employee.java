package task03;

public class Employee extends Person{
    String job;


    public Employee(String name, String job) {
        super(name, 0);
        this.job = job;
        printInfo();
    }

    private void printInfo() {
        System.out.println(name.toUpperCase() + " " + job.toUpperCase());
    }
}
