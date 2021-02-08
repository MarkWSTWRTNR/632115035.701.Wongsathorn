
package Shape;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "This is a rectangle with width as " + width + " and height as " + height + ".";
    }

}
