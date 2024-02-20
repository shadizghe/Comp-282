import java.lang.Math;

public class Circle2D {
    private double x, y, radius; // Coordinates and radius of the circle

    public Circle2D() {
        this(0, 0, 1); // Call the other constructor with default values
    }

    public Circle2D(double x, double y, double radius) {
        // Set the x-coordinate of the center of the circle to the value provided
        this.x = x;
        // Set the y-coordinate of the center of the circle to the value provided
        this.y = y;
        // Set the radius of the circle to the value provided
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public boolean contains(double x, double y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y)) < radius;
    }

    public boolean contains(Circle2D circle) {
        double distance = Math.sqrt((circle.x - this.x) * (circle.x - this.x) + (circle.y - this.y) * (circle.y - this.y));
        return distance + circle.radius <= this.radius;
    }

    public boolean overlaps(Circle2D circle) {
        double distance = Math.sqrt((circle.x - this.x) * (circle.x - this.x) + (circle.y - this.y) * (circle.y - this.y));
        return distance < this.radius + circle.radius;
    }

    public static void main(String[] args) {
        Circle2D c1 = new Circle2D(2, 2, 5.5);
        System.out.println();
        System.out.println("Area of c1: " + String.format("%.2f", c1.getArea()));
        System.out.println("Perimeter of c1: " + String.format("%.2f", c1.getPerimeter()));
        System.out.println("c1.contains(3, 3): " + c1.contains(3, 3));
        System.out.println("c1.contains(new Circle2D(4, 5, 10.5)): " + c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("c1.overlaps(new Circle2D(3, 5, 2.3)): " + c1.overlaps(new Circle2D(3, 5, 2.3)));
        System.out.println();
    }
    

}