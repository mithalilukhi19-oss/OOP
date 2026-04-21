import java.util.Scanner;

class VolumeCalculator {

    // Volume of Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Volume of Rectangular Cube
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Volume of Sphere
    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

// Main class
public class Pr12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VolumeCalculator vc = new VolumeCalculator();

        // Cube
        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube: " + vc.calculateVolume(side));

        // Rectangular Cube
        System.out.print("\nEnter length, width, height of rectangular cube: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of Rectangular Cube: " + vc.calculateVolume(l, w, h));

        // Sphere
        System.out.print("\nEnter radius of sphere: ");
        float r = sc.nextFloat();
        System.out.println("Volume of Sphere: " + vc.calculateVolume(r));

        sc.close();
    }
}
/* output 
  Enter side of cube: 3
Volume of Cube: 27.0

Enter length, width, height of rectangular cube: 2 3 4
Volume of Rectangular Cube: 24.0

Enter radius of sphere: 2
Volume of Sphere: 33.510321638291124 */
