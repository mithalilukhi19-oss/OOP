// Interface Exam
interface Exam {
    boolean isPassed(int mark);
}

// Interface Classify
interface Classify {
    String getDivision(double average);
}

// Class implementing both interfaces
class Result implements Exam, Classify {

    // Implement isPassed method
    @Override
    public boolean isPassed(int mark) {
        return mark >= 40; // Pass if marks >= 40
    }

    // Implement getDivision method
    @Override
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

// Main class
public class Pr17 {
    public static void main(String[] args) {

        // Create object
        Result result = new Result();

        // Sample values
        int mark = 45;
        double average = 58.5;

        // Call methods
        System.out.println("Marks: " + mark);
        System.out.println("Passed: " + result.isPassed(mark));

        System.out.println("Average: " + average);
        System.out.println("Division: " + result.getDivision(average));
    }
}
/*output 
  Marks: 45
Passed: true
Average: 58.5
Division: Second Division */
