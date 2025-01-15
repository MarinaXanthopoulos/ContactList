public class Adult extends Person {
    // Instance variables
    private boolean isEmployed;

    // Constructor
    public Adult(String firstName, String lastName, String phoneNumber, boolean isEmployed){
        super(firstName, lastName, phoneNumber);
        this.isEmployed = isEmployed;
    }

    // Getter
    public boolean getIsEmployed() {
        return isEmployed;
    }

    // ToString
    public String toString(){
        return super.toString() + " Employed: " + getIsEmployed();
    }
}
