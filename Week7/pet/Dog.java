//632115035 Wongsathorn Woratanarat
package pet;

public class Dog extends Pet {
    String size;
    String hair;
    String place;

    public Dog(String name, int age, String species, String color, String size, String hair, String place) {
        super(name, age, species, color);
        this.size = size;
        this.hair = hair;
        this.place = place;

    }

    public void run() {
        System.out.println("My dog " + name + " is running in " + place);
    }

    public void bark() {
        System.out.println(size + " bark Box Box!!");
    }

    public void isShortHair() {
        System.out.println("Short hair : " + hair);
    }
}
