public class Person {
    private String name;
    private String number;

    public Person(String name, String phoneNumber) {
        this.name = name;
        this.number = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return this.name + " number: " + this.number;
    }

    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }
}
