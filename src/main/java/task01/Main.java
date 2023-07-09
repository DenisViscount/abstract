package task01;

public class Main {
    public static void main(String[] args) throws PersonNotFoundException {
        InMemoryStorage inMemoryStorage = null;


            Person person = inMemoryStorage.findPersonByName("John");

        throw new PersonNotFoundException("Person with name '" + person.getName() + "' not found");
        }
        


    }

