import java.util.ArrayList;

public class ContactList {
    // Instance variables
    private ArrayList<Person> contacts;

    // Constructor
    public ContactList(){
        this.contacts = new ArrayList<>();
    }

    // Getter
    public ArrayList<Person> getContacts(){
        return contacts;
    }

    // Add contacts to list
    public void addContact(){

    }


    // Run function
    public void run(){
        printMenu();
        userInput();
    }

    private void printMenu() {
        System.out.println("Menu:");
        System.out.print("1. Add Contact");
        System.out.print("2. List All Contacts By First Name");
        System.out.print("3. List All Contacts By Last Name");
        System.out.print("4. List All Contacts By Phone Number");
        System.out.print("5. List All Students");
        System.out.print("6. Search By First Name");
        System.out.print("7. Search By Last Name");
        System.out.print("8. Search By Phone Number");
        System.out.print("0. Exit");
    }

    private void userInput() {

    }

    public void main(){
        run();
    }
}
