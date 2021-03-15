public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject geo1 = new Circle(5);
        GeometricObject geo2 = new Rectangle(5, 3);
        GeometricObject geo3 = new Triangle(3, 4);

        System.out.print("Circle: ");
        displayGeometricObject(geo1);
        System.out.println(" ");

        System.out.print("Rectangle: ");
        displayGeometricObject(geo2);
        System.out.println(" ");
        
        System.out.print("Triangle: ");
        displayGeometricObject(geo3);
    }

    public static void displayGeometricObject(GeometricObject object) {
        System.out.println();
        System.out.println("The area is: " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }

}
