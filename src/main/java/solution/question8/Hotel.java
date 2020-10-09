package solution.question8;

// Solution to question 8.
// Copy your Hotel class from project 1 and make the class immutable
public final class Hotel { // make class final
    // Make all instance variables final
    private final String name;
    private final String id;
    private final Address address;

    /**
     * Hotel Constructor
     * @param name
     * @param id
     * @param address
     */
    public Hotel(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.address = new Address(address);
    }

    public String getId() {
        return this.id;
    } // Strings are immutable, so we are not breaking encapsulaiton

    public Address getAddress() {
        return new Address(this.address); // defensive copy; we do not return a reference to our instance variable
    }

    /**
     * toString method that return a string of name, id, coordinate, address
     * @return
     */
    @Override
    public String toString() {
        return System.lineSeparator() +
                name + System.lineSeparator() +
                id + System.lineSeparator() +
                address.toString() + System.lineSeparator();
        }
}