//632115035 Wongsathorn Woratanarat
package CCircle;

public class MainCircle {
    public static void main(String[] agrs) {
        Circle circel1 = new Circle(0.0, 0.0, 2);
        circel1.Area();
        System.out.println("Area of cir1 " + circel1.Area());
        circel1.Circum();
        System.out.println(" ");

        Circle circel2 = new Circle(1.0, 2.0, 3);
        circel2.Area();
        System.out.println("Area of cir2 " + circel2.Area());
        circel2.Circum();
        System.out.println(" ");

        Circle circel3 = new Circle(3.0, 5.0, 1);
        circel3.Area();
        System.out.println("Area of cir3 " + circel3.Area());
        circel3.Circum();
        System.out.println(" ");

        Circle circel4 = new Circle(-1.0, -10.0, -1);
        circel4.Area();
        System.out.println("Area of cir4 " + circel4.Area());
        circel4.Circum();
        System.out.println(" ");

        System.out.println("Is circle 1 intersec circle 2 :" + circel1.Intersect(circel2));
        System.out.println("Is circle 1 intersec circle 3 :" + circel1.Intersect(circel3));
    }
}
