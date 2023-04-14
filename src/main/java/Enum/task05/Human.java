package Enum.task05;


public class Human {
    static int countMale = 0;
    static int countFemale = 0;
    private String name;
    private int age;
    private Gender gender;

    public Human(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        getGender();
    }
    public String toString() {
        return "Human{" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", gender: " + gender +
                '}';
    }
    private void  getGender(){
        if(gender == Gender.FEMALE){
            countFemale++;
            System.out.println("Female = " + countFemale);
        }
        if (gender == Gender.MALE){
            countMale++;
            System.out.println("Male = " + countMale);
        }

    }

}
