import java.util.Scanner;

// Base class
class Shape {
    double d1, d2;

    // Method to initialize data
    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

// Derived class: Triangle
class Triangle extends Shape {

    // Method to calculate area
    double calculateArea() {
        return 0.5 * d1 * d2; // d1 = base, d2 = height
    }
}

// Derived class: Rectangle
class Rectangle extends Shape {

    // Method to calculate area
    double calculateArea() {
        return d1 * d2; // d1 = length, d2 = width
    }
}

// Main class
public class Pr13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Triangle
        Triangle t = new Triangle();
        System.out.print("Enter base and height of triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        t.getData(base, height);
        System.out.println("Area of Triangle: " + t.calculateArea());

        // Rectangle
        Rectangle r = new Rectangle();
        System.out.print("\nEnter length and width of rectangle: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        r.getData(length, width);
        System.out.println("Area of Rectangle: " + r.calculateArea());

        sc.close();
    }
}
/*output 
  Enter base and height of triangle: 5 4
Area of Triangle: 10.0

Enter length and width of rectangle: 6 3
Area of Rectangle: 18.0 */
