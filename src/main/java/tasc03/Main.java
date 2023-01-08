package tasc03;

public class Main {
    public static void main(String[] args) {
        HRDirector hrDirector = new HRDirector("Mike",45,20);
        CFO cfo = new CFO("Donatello",43,18);
        cfo.makeReport();
        cfo.PrepareFinancialPlan();
        hrDirector.makeReport();
        hrDirector.hireAnEmployee();
    }
}
