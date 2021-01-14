package Person;

public class Hairdresser extends Person {
    String genre;

    public Hairdresser(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void cut() {
        System.out.println(name + " is cutting " + genre + " for a customer");
    }
}
