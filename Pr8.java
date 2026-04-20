import java.util.Scanner;

class Point {
    int x, y;

    // Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Display method
    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }
}

// Main class
public class Pr8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default constructor
        Point p1 = new Point();
        System.out.println("Default Constructor:");
        p1.display();

        // Parameterized constructor (user input)
        System.out.print("\nEnter x value: ");
        int x = sc.nextInt();

        System.out.print("Enter y value: ");
        int y = sc.nextInt();

        Point p2 = new Point(x, y);
        System.out.println("Parameterized Constructor:");
        p2.display();

        // Copy constructor
        Point p3 = new Point(p2);
        System.out.println("Copy Constructor:");
        p3.display();

        sc.close();
    }
}
/*output 
  Default Constructor:
Point coordinates: (5, 5)

Enter x value: 10
Enter y value: 20
Parameterized Constructor:
Point coordinates: (10, 20)

Copy Constructor:
Point coordinates: (10, 20) */
