//632115035 Wongsathorn Woratanarat
/**
 * Testoverride1
 */
public class Testoverride1 {
    public static void main(String[] args) {
        Person person1;
        person1 = new Person("Mark", 2001);
        person1.introduce();

        System.out.println(" ");

        Sheriff person2;
        person2 = new Sheriff("Mateo", 1988, "California");
        person2.introduce();

        System.out.println(" ");

        Teacher person3;
        person3 = new Teacher("Ball", 1977, "CMU");
        person3.introduce();

        System.out.println(" ");

        Primeministe person4;
        person4 = new Primeministe("Tu", 1954, "Thailand");
        person4.introduce();

        System.out.println(" ");

        Football person5;
        person5 = new Football("Messi", 1987, "Barcelona football club");
        person5.introduce();

    }

}