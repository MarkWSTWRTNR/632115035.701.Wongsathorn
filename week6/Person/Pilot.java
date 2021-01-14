package Person;

public class Pilot extends Person {
    String genre;

    public Pilot(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void contorl() {
        System.out.println(name + " drives a " + genre);
    }
}
