package task01;

public class InMemoryStorage {
    private Person[] persons;

    public InMemoryStorage(int size) {
        persons = new Person[size];
    }
    public void addPerson(Person person, int index) {
        persons[index] = person;
    }

    public Person getElement(int index){
        if(index< 0 || index >= persons.length){
            throw new IndexOutOfBoundsException("Invalid index: " + index);

        }
        return persons[index];
    }
    public Person findPersonByName(String name) throws PersonNotFoundException {
        for (Person person : persons) {
            if (person != null && person.getName().equals(name)) {
                return person;
            }
        }
        throw new PersonNotFoundException("Person with name '" + name + "' not found");
    }
    public void changeAgeByIndex(int index, int newAge) throws InvalidAgeException {
        if (index < 0 || index >= persons.length) {
            throw new IllegalArgumentException("Invalid index");
        }
        if (newAge < 0 || newAge > 120) {
            throw new InvalidAgeException("Invalid age value: " + newAge);
        }
        persons[index].setAge(newAge);
    }

    public int getFirstAdultIndex() throws PersonNotFoundException {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() >= 18) {
                return i;
            }
        }
        throw new PersonNotFoundException("No adult person found");
    }
}
