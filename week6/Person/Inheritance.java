package Person;

public class Inheritance {
    public static void main(String[] args) {
        Artist art = new Artist("Ball", 20, "Male");
        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

        System.out.println(" ");

        Nurse nurse = new Nurse("Namfah", 19, "Female");
        nurse.genre = "patients";
        nurse.introduce();
        nurse.patientCare();

        System.out.println(" ");

        Pilot pi = new Pilot("Tonkla", 19, "Male");
        pi.genre = "Plane";
        pi.introduce();
        pi.contorl();

        System.out.println(" ");

        Police popo = new Police("Ter", 20, "Male");
        popo.genre = " robber ";
        popo.introduce();
        popo.arrest();

        System.out.println(" ");

        Butcher bu = new Butcher("Parn", 19, "Female");
        bu.genre = " meat";
        bu.introduce();
        bu.sell();

        System.out.println(" ");

        Hairdresser hair = new Hairdresser("Nun", 18, "Female");
        hair.genre = " hair";
        hair.introduce();
        hair.cut();

    }

}
