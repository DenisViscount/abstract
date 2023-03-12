package task03;

public class Person {
    String name;

    public Person(String name) {

        this.name = name;
        printInfo();

    }
    public Person(String name, int a) {
        this.name = name;


    }

    private void printInfo(){
        System.out.println(name.toUpperCase());
    }

}
