/**
 * StudentData
 */
public class StudentData {

    public static void main(String[] args) {
        // Student object include name, age, gpa
        Student std01 = new Student("Mark", 18, 4.00);
        Student std02 = new Student("Jane", 18, 2.20);
        Student std03 = new Student("Peter", 19, 4.00);
        Student std04 = new Student("Mark", 22, 1.75);
        // Name
        System.out.println("[Name] std01 equals std02 " + std01.equals(std02));
        System.out.println("[Name] std01 equals std03 " + std01.equals(std03));
        System.out.println("[Name] std02 equals std04 " + std02.equals(std04));
        System.out.println("[Name] std01 equals std04 " + std01.equals(std04));
        System.out.println(" ");
        // Age
        System.out.println("[Age]  std01 equals std02 " + std01.equals1(std02));
        System.out.println("[Age]  std03 equals std04 " + std03.equals1(std04));
        System.out.println("[Age]  std01 equals std03 " + std01.equals1(std03));
        System.out.println(" ");
        // Gpa
        System.out.println("[Gpa]  std01 equals std03 " + std01.equals2(std03));
        System.out.println("[Gpa]  std02 equals std04 " + std02.equals2(std04));
        System.out.println("[Gpa]  std02 equals std03 " + std02.equals2(std03));
        System.out.println(" ");
    }

}