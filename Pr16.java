import java.util.Scanner;

// Interface
interface Classify {
    String getDivision(double average);
}

// Class implementing the interface
class Result implements Classify {

    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Below First Division";
        }
    }
}

// Main class
public class Pr16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter average marks: ");
        double avg = sc.nextDouble();

        Result res = new Result();
        String division = res.getDivision(avg);

        System.out.println("Division: " + division);

        sc.close();
    }
}
/* output 
  Enter average marks: 75
Division: First Division */
