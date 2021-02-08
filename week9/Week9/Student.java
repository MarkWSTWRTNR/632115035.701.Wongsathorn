//632115035 Wongsathorn Woratanarat
package Week9;

/**
 * Student
 */
public class Student {

    private String firstname = " Hello ";
    private String lastname = " World ";

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String toString() {
        return "My first name " + firstname + " last name " + lastname;
    }

    public static void main(String[] args) {

        Student p = new Student("Wongsathorn", "Woratanarat");
        System.out.println(p.toString());
    }

}