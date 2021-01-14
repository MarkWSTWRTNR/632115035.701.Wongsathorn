package Person;

public class Nurse extends Person {
    String genre;

    public Nurse(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void patientCare() {
        System.out.println(name + " takes care of " + genre);
    }
}
