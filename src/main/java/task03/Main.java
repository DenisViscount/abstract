package task03;

public class Main {
    public static void main(String[] args) {
        HRDirector hrDirector = new HRDirector("Mike",45,20);
        FinancialDirector financialDirector = new FinancialDirector("Donatello",43,18);
        financialDirector.makeReport();
        financialDirector.prepareFinancialPlan();
        hrDirector.makeReport();
        hrDirector.hireAnEmployee();
    }
}
