import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> peopleInBook;

    public Phonebook() {
        this.peopleInBook = new ArrayList<Person>();
    }

    public void add(String name, String number){
        Person person = new Person(name, number);

        this.peopleInBook.add(person);
    }

    public void printAll() {
        for (Person person : this.peopleInBook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name){

        String notFound = "number not found";

        for (Person person : this.peopleInBook){

            if (name.equals(person.getName())){
                return person.getNumber();
            }
        }
        return notFound;
    }
}
