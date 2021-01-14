//632115035 Wongsathorn Woratanarat
package CCircle;

public class Circle {
    private double radius = 0;
    private double x = 0;
    private double y = 0;
    private static int i = 0;

    public Circle(double x, double y) {
        i++;
        this.x = x;
        this.y = y;
        this.radius = 1;
    }

    public Circle(double x, double y, double radius) {
        i++;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double Area() {
        if (radius < 0) {
            return 0;
        } else {
            return Math.PI * (radius * radius);
        }
    }

    public void Circum() {

        if (radius < 0) {
            System.out.println("CircumFrenece of cir4 = 0.0");
        } else {
            System.out.println("CircumFrenece of cir " + i + " = " + (2 * Math.PI * radius));
        }
    }

    public boolean Intersect(Circle C2) {
        double Distance = Math.sqrt(Math.pow(this.x - C2.x, 2) + Math.pow(this.y - C2.y, 2));
        if (Distance > this.radius + C2.radius) {
            return false;
        } else {
            return true;
        }
    }
}
