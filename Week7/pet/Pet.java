//632115035 Wongsathorn Woratanarat
package pet;
/**
 * Pet
 */
public class Pet {
    String name;
    int age;
    String species;
    String color;

    public Pet(String name, int age, String species, String color) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.color = color;

    }

    public void showPetData() {
        System.out.println("Name is : " + name);
        System.out.println(" Species: " + species);
        System.out.println("  Color : " + color);
        System.out.println("    Age : " + age + "year");

    }
}