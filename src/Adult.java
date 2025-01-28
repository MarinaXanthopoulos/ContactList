public class Adult extends Person {
    // Instance variables
    private String occupation;

    // Constructor
    public Adult(String firstName, String lastName, String phoneNumber, String occupation){
        super(firstName, lastName, phoneNumber);
        this.occupation = occupation;
    }

    // Getter
    public String getOccupation() {
        return occupation;
    }

    // ToString
    public String toString(){
        return super.toString() + " Employed: " + getOccupation();
    }
}
