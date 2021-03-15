
public class Triangle extends GeometricObject {
    private double base;
    private double height;

    public Triangle() {

    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPythagoras() {
        return Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));
    }

    public double getPerimeter() {
        return getPythagoras() + base + height;
    }

}
