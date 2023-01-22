package task04;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("BMW",200,0.1,70);
        Mercedes mercedes = new Mercedes("Mercedes",150,0.15,60);
        Kia kia = new Kia("Kia",100,0.12,20);
        Lada lada = new Lada("Lada",90,0.1,50);
        int distance = 1000;

        int stepsBmw = bmw.drive(distance);
        int stepsMercedes = mercedes.drive(distance);
        int stepsKia =  kia.drive(distance);
        int  stepsLada = lada.drive(1000);
        System.out.println(stepsBmw);
        System.out.println(stepsMercedes);
        System.out.println(stepsKia);
        System.out.println(stepsLada);





    }
}
