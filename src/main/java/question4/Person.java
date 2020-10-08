package question4;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Person)) {
            System.out.println(other.getClass().getName());
            return false;
        }
        Person otherPerson = (Person) other;
        if (name.equals(otherPerson.name))
            return true;
        return false;
    }
}
