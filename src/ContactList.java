import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    // Instance variables
    private ArrayList<Person> contacts;

    // Constructor
    public ContactList(){
        contacts = new ArrayList<>();
    }

    // Getter
    public ArrayList<Person> getContacts(){
        return contacts;
    }

    // Add contacts to list
    public void addContact(Person contact){
        contacts.add(contact);
    }

    // Print contacts
    public void printContacts(){
        // Go through each contact in contacts and print
        for(Person contact : contacts) {
            System.out.println(contact);
        }
    }

    // Sort contacts -bubble sort
    public void sort (int sortBy){
        // Go through every contact
        for(int i = 0; i < contacts.size() - 1; i++){
            // Compare next contact for bubble sorting
            for(int j = 0; j < contacts.size() - i - 1; j++) {
                // Track when swapping is needed
                boolean swap = false;

                // Sort by first name
                if (sortBy == 0 && contacts.get(j).getFirstName().compareTo(contacts.get(j + 1).getFirstName()) > 0){
                    swap = true;
                }
                // Sort by last name
                else if (sortBy == 1 && contacts.get(j).getLastName().compareTo(contacts.get(j + 1).getLastName()) > 0){
                    swap = true;
                }
                // Sort by phone number
                else if (sortBy == 2 && contacts.get(j).getPhoneNumber().compareTo(contacts.get(j + 1).getPhoneNumber())
                        > 0){
                    swap = true;
                }

                // Perform swap if needed
                if(swap){
                    Person temporary = contacts.get(j);
                    contacts.set(j, contacts.get(j + 1));
                    contacts.set(j + 1, temporary);
                }
            }
        }
    }

    // Search by first name
    public Person searchByFirstName(String firstName){
        for(Person contact : contacts){
            if(contact.getFirstName().equals(firstName)){
                return contact;
            }
        }
        return null;
    }

    // Search by last name
    public Person searchByLastName(String lastName){
        for(Person contact : contacts){
            if(contact.getLastName().equals(lastName)){
                return contact;
            }
        }
        return null;
    }

    // Search by phone number
    public Person searchByPhoneNumber(String number){
        for(Person contact : contacts){
            if(contact.getPhoneNumber().equals(number)){
                return contact;
            }
        }
        return null;
    }

    // List all Student contacts
    public void listStudents(){
        // Go through every contact in contacts
        for(Person contact : contacts){
            // See if the current contact is a Student (an instanceof the student class)
            if (contact instanceof Student){
                System.out.println(contact);
            }
        }
    }

    // Print the options for using the contact list
    private void printMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add Contact");
        System.out.println("2. List All Contacts By First Name");
        System.out.println("3. List All Contacts By Last Name");
        System.out.println("4. List All Contacts By Phone Number");
        System.out.println("5. List All Students");
        System.out.println("6. Search By First Name");
        System.out.println("7. Search By Last Name");
        System.out.println("8. Search By Phone Number");
        System.out.println("0. Exit");
    }

    // Run function
    public void run(){
        Scanner input = new Scanner(System.in);
        int choice = -1;
        String searchName;
        Person addition = null;

        // Keep waiting for users number
        while (choice != 0){
            printMenu();
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                // Add new contact
                case 1:
                    System.out.println("Select a type of contact to add:");
                    System.out.println("1. Student");
                    System.out.println("2. Adult");
                    int type = input.nextInt();
                    input.nextLine();

                    System.out.println("Enter first name: ");
                    String newFirstName = input.nextLine();
                    System.out.println("Enter last name: ");
                    String newLastName = input.nextLine();
                    System.out.println("Enter phone number: ");
                    String newPhoneNumber = input.nextLine();

                    if(type == 1){
                        System.out.println("Enter grade: ");
                        int newGrade = input.nextInt();
                        input.nextLine();
                        addContact(new Student(newFirstName, newLastName, newPhoneNumber, newGrade));
                    }
                    else if (type == 2) {
                        System.out.println("Enter occupation: ");
                        String newOccupation = input.nextLine();
                        addContact(new Adult(newFirstName, newLastName, newPhoneNumber, newOccupation));
                    }
                    else {
                        System.out.println("Can't add.");
                    }
                    break;

                // List by first name
                case 2:
                    sort(0);
                    printContacts();
                    break;

                // List by last name
                case 3:
                    sort(1);
                    printContacts();
                    break;

                // List by phone number
                case 4:
                    sort(2);
                    printContacts();
                    break;

                // List all students
                case 5:
                    listStudents();
                    break;

                // Search by first name
                case 6:
                    System.out.println("Enter first name: ");
                    searchName = input.nextLine();
                    Person found = searchByFirstName(searchName);
                    if(found != null){
                        System.out.println(found);
                    }
                    else {
                        System.out.println(searchName + " is not in the list.");
                    }
                    break;

                // Search by last name
                case 7:
                    System.out.println("Enter last name: ");
                    searchName = input.nextLine();
                    Person lastFound = searchByLastName(searchName);
                    if(lastFound != null){
                        System.out.println(lastFound);
                    }
                    else {
                        System.out.println(searchName + " is not in the list.");
                    }
                    break;

                // Search by phone #
                case 8:
                    System.out.println("Enter phone number: ");
                    String searchNum = input.nextLine();
                    Person phoneFound = searchByPhoneNumber(searchNum);
                    if(phoneFound != null){
                        System.out.println(phoneFound);
                    }
                    else {
                        System.out.println(searchNum + " is not in the list.");
                    }
                    break;

                // exit
                case 0:
                    System.out.println("Bye!");
                    break;
            }
        }
    }

    public static void main(String[]arg){
        ContactList contactList = new ContactList();
        contactList.run();
    }
}
