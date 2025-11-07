interface Shape {
    void draw();
}

// Step 2: Concrete implementations
class Circle implements Shape {
    public void draw() { System.out.println("Draw a Circle"); }
}

class Rectangle implements Shape {
    public void draw() { System.out.println("Draw a Rectangle"); }
}

class Square implements Shape {
    public void draw() { System.out.println("Draw a Square"); }
}

// Step 3: ShapeFactory
class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) return null;
        switch (type.toLowerCase()) {
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
            case "square": return new Square();
            default: return null;
        }
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("circle");
        Shape shape2 = factory.getShape("rectangle");
        Shape shape3 = factory.getShape("square");

        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
