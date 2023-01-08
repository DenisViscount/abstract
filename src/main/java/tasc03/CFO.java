package tasc03;

public class CFO extends Director {
    public CFO(String name, int age, int workExperience) {
        super(name, age, workExperience);
    }

    @Override
    public void makeReport() {
        System.out.println("Report done");
    }
    public void PrepareFinancialPlan(){
        System.out.println("Financial plan ready");
    }
}
