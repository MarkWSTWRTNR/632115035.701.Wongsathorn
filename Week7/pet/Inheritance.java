//632115035 Wongsathorn Woratanarat
package pet;

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("milo", 4, "Pomeranian", "White", "Small", "True", "the park");
        dog.showPetData();
        dog.run();
        dog.bark();
        dog.isShortHair();

        System.out.println(" ");

        Fish fish = new Fish("Yut", 3, "Goldfish", "Orange", "True", "Fresh water", 10);
        fish.showPetData();
        fish.size();
        fish.isSwimToTheSea();
        fish.swimFast();

        System.out.println(" ");

        Bird bird = new Bird("leo", 2, "Hummingbird", "Blue", "France", "True", "False");
        bird.showPetData();
        bird.speak();
        bird.checkCountry();
        bird.itCanFly();
    }
}
