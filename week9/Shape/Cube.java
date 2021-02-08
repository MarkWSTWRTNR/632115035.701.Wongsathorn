package Shape;

public class Cube extends Rectangle {
    int length;
    public Cube(int width , int height ,int length){
        super(width, height);
        this.length = length;
    }
    
    public String toString() {
        return "This is a cube with whe side of "+length+".";
        
    }
}
