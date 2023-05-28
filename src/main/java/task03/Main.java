package task03;
//Создать класс Человек, у которого есть следующие поля: Имя, возраст.
// Предусмотреть недопустимые ситуации для конструкторов и сеттеров полей. Бросить исключения при ошибке
public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        try {
            Human human = new Human("Bob",5);
            System.out.println("name: " + human.getName());
            System.out.println("age: " + human.getAge());

            human.setAge(-3);

        }
        catch (IllegalArgumentException e){
            System.out.println("Error" + e.getMessage());
        }

    }

}
