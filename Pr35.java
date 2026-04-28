import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class Pr35 extends Application {

    @Override
    public void start(Stage stage) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter Projects %: ");
        double proj = sc.nextDouble();

        System.out.print("Enter Quizzes %: ");
        double quiz = sc.nextDouble();

        System.out.print("Enter Midterm %: ");
        double mid = sc.nextDouble();

        System.out.print("Enter Final Exam %: ");
        double fin = sc.nextDouble();

        double scale = 3; // scale factor for height

        // Create bars
        VBox v1 = createBar("Projects", proj, Color.RED, scale);
        VBox v2 = createBar("Quizzes", quiz, Color.BLUE, scale);
        VBox v3 = createBar("Midterm", mid, Color.GREEN, scale);
        VBox v4 = createBar("Final", fin, Color.ORANGE, scale);

        // Arrange horizontally
        HBox root = new HBox(30, v1, v2, v3, v4);
        root.setAlignment(Pos.BOTTOM_CENTER);

        Scene scene = new Scene(root, 500, 400);

        stage.setTitle("Grade Distribution Bar Chart");
        stage.setScene(scene);
        stage.show();
    }

    // Method to create each bar
    private VBox createBar(String name, double value, Color color, double scale) {
        Rectangle rect = new Rectangle(50, value * scale);
        rect.setFill(color);

        Text label = new Text(name + " - " + value + "%");

        VBox box = new VBox(10, rect, label);
        box.setAlignment(Pos.BOTTOM_CENTER);

        return box;
    }

    public static void main(String[] args) {
        launch();
    }
}
/* output 
Projects: 20
Quizzes: 10
Midterm: 30
Final: 40 */
