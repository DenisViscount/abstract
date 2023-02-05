package task03;

public class FinancialDirector extends Director {
    public FinancialDirector(String name, int age, int workExperience) {
        super(name, age, workExperience);
    }

    @Override
    public void makeReport() {
        System.out.println("Report done");
    }
    public void prepareFinancialPlan(){
        System.out.println("Financial plan ready");
    }
}
