//632115035 Wongsathorn Woratanarat
package pet;

public class Fish extends Pet {
    String size;
    String typeWater;
    int speed;

    public Fish(String name, int age, String species, String color, String size, String typeWater, int speed) {
        super(name, age, species, color);
        this.size = size;
        this.typeWater = typeWater;
        this.speed = speed;
    }

    public void size() {
        System.out.println("Size : " + size);
    }

    public void isSwimToTheSea() {
        System.out.println("My fish " + name + " is swimming in " + typeWater);
    }

    public void swimFast() {
        System.out.println("Swim fast : " + speed+"km/hr.");
    }

}
