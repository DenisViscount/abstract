package task03;

public class HRDirector extends Director {
    public HRDirector(String name, int age, int workExperience) {
        super(name, age, workExperience);
    }

    @Override
    public void makeReport() {
        System.out.println("Report done");
    }
    public void hireAnEmployee(){
        System.out.println("Employee hired");

    }
}
