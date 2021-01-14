package Person;

public class Butcher extends Person {
    String genre;

    public Butcher(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public void sell() {
        System.out.println(name + " is selling " + genre + " on the market");
    }
}
