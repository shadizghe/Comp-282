import java.lang.Math;

public class MyPoint {
    private double x;
    private double y;

    // Constructors
    public MyPoint() {
        this(0, 0); // calls the constructor with specified coordinates
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Method to calculate distance between two MyPoint objects
    public double distance(MyPoint point) {
        return Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
    }

    // Method to calculate distance between this point and a specified point
    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    // Static method to calculate distance between two MyPoint objects
    public static double distance(MyPoint p1, MyPoint p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }

    public static void main(String[] args) {
        // Create two points
        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10, 30.5);
    
        // Calculate the distance between the two points
        double distance = point1.distance(point2);
    
        // Display the distance between the two points with two decimal places
        System.out.println();
        System.out.printf("Distance between point 1 and point 2: %.2f\n", distance);
        System.out.println();
    }
    
}
