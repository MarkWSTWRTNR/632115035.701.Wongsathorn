//632115035 Wongsathorn Woratanarat
package Shape;

/**
 * mainShape
 */
public class mainShape {
    public static void main(String[] args) {
        Shape a1 = new Shape();
        System.out.println(a1.toString());

        Rectangle a2 = new Rectangle(10, 10);
        System.out.println(a2.toString());

        Cube a3 = new Cube(10, 10, 10);
        System.out.println(a3.toString());
    }
}