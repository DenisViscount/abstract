package task04;

public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("BMW",180,0.4,70);
        Mercedes mercedes = new Mercedes("Mercedes",150,0.3,60);
        Kia kia = new Kia("Kia",100,0.2,40);
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
