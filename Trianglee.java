import java.util.Scanner;

class GeometricObject {
    private String color;
    private boolean filled;

    public GeometricObject() {
        color = "white";
        filled = false;
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Filled: " + filled;
    }
}

class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle() {
        side1 = side2 = side3 = 1.0;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}

public class Trianglee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println();

            System.out.print("Enter three sides of the triangle: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();
            System.out.print("Enter the color of the triangle: ");
            String color = input.next();

            // Validate color input to accept only letters
            while (!color.matches("[a-zA-Z]+")) {
                System.out.println("Invalid input. Please enter a valid color (letters only): ");
                color = input.next();
            }

            System.out.print("Is the triangle filled (true/false): ");
            boolean filled = input.nextBoolean();

            Triangle triangle = new Triangle(side1, side2, side3);
            triangle.setColor(color);
            triangle.setFilled(filled);
            System.out.println();
            System.out.printf("Area: %.2f\n", triangle.getArea());
            System.out.printf("Perimeter: %.2f\n", triangle.getPerimeter());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Filled: " + triangle.isFilled());
            System.out.println();
        } finally {
            // Close the Scanner object
            input.close();
        }
    }

}