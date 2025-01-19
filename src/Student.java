public class Student extends Person {
    // Instance variables
    private int grade;

    // Constructor
    public Student(String firstName, String lastName, String phoneNumber, int grade){
        super(firstName, lastName, phoneNumber);
        this.grade = grade;
    }

    // Getter
    public int getGrade() {
        return grade;
    }

    // ToString
    public String toString(){
        return super.toString() + " Grade: " + grade;
    }
}
