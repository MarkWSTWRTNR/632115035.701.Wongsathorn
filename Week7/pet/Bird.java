//632115035 Wongsathorn Woratanarat
package pet;

public class Bird extends Pet {
    String country;
    String canfly;
    String speak;

    public Bird(String name, int age, String species, String color, String country, String canfly, String speak) {
        super(name, age, species, color);
        this.country = country;
        this.canfly = canfly;
        this.speak = speak;

    }

    public void speak() {
        System.out.println("Speak : " + speak);
    }

    public void checkCountry() {
        System.out.println("Country : " + country);
    }

    public void itCanFly() {
        System.out.println("Fly : " + canfly);
    }
}
