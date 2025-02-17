// An interface indicating cloning capability
interface CloneableShape {
    CloneableShape cloneShape();
    void draw(); 
}

// A concrete "Circle" implementing the prototype method
class Circle implements CloneableShape {
    protected int x, y, radius;
    private String color;

    public Circle(int x, int y, int radius, String color) {
        this.x = x; 
        this.y = y;
        this.radius = radius; 
        this.color = color;
    }

    // The actual "prototype" cloning
    @Override
    public Circle cloneShape() {
        // Creates a new Circle with the same fields
        return new Circle(this.x, this.y, this.radius, this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle at (" + x + "," + y + ") with radius " 
                           + radius + " and color " + color);
    }

    // If you want getters/setters, add them here
}

// A short demo
public class PrototypeDemo {
    public static void main(String[] args) {
        // 1) Create a prototype
        Circle prototypeCircle = new Circle(10, 20, 5, "red");

        // 2) Clone it multiple times
        Circle clone1 = prototypeCircle.cloneShape();
        Circle clone2 = prototypeCircle.cloneShape();

        // 3) Draw or manipulate clones
        clone1.draw();
        clone2.draw();

        // If needed, you could modify the clones slightly
        clone2 = new Circle(clone2.x, clone2.y, clone2.radius, "blue"); 
        clone2.draw(); // now a blue circle, same coords
    }
}
