package Person;

public class Police extends Person {
    String genre;

    public Police(String name, int age, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }
    public void arrest(){
        System.out.println(name + " arrest the "+genre+" in the market ");
    }
}
