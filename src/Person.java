public class Person {
    // Instance variables
    private String firstName;
    private String lastName;
    private String phoneNumber;

    // Constructor
    public Person (String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " - #" + phoneNumber;
    }
}
