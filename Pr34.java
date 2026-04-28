import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Pr34 extends Application {

    @Override
    public void start(Stage stage) {

        // Create UI
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Fields
        TextField rollField = new TextField();
        TextField nameField = new TextField();
        TextField ageField = new TextField();
        TextField emailField = new TextField();

        Button submitBtn = new Button("Submit");

        // Add to grid
        grid.add(new Label("Roll No:"), 0, 0);
        grid.add(rollField, 1, 0);

        grid.add(new Label("Name:"), 0, 1);
        grid.add(nameField, 1, 1);

        grid.add(new Label("Age:"), 0, 2);
        grid.add(ageField, 1, 2);

        grid.add(new Label("Email:"), 0, 3);
        grid.add(emailField, 1, 3);

        grid.add(submitBtn, 1, 4);

        // Button action
        submitBtn.setOnAction(e -> {
            try {
                String rollText = rollField.getText();
                String name = nameField.getText();
                String ageText = ageField.getText();
                String email = emailField.getText();

                // Validation
                int rollNo = Integer.parseInt(rollText);
                int age = Integer.parseInt(ageText);

                if (!email.contains("@") || !email.contains(".")) {
                    throw new Exception("Invalid email format.");
                }

                // File chooser
                FileChooser fileChooser = new FileChooser();
                fileChooser.setTitle("Save Registration Data");
                File file = fileChooser.showSaveDialog(stage);

                if (file != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                    bw.write(rollNo + ", " + name + ", " + age + ", " + email);
                    bw.newLine();
                    bw.close();
                }

                // Success alert
                Alert success = new Alert(Alert.AlertType.INFORMATION);
                success.setTitle("Success");
                success.setHeaderText("Registration Successful");
                success.setContentText(
                        "Roll No: " + rollNo +
                        "\nName: " + name +
                        "\nAge: " + age +
                        "\nEmail: " + email
                );
                success.showAndWait();

            } catch (NumberFormatException ex) {
                showError("Roll No and Age must be integers.");

            } catch (IOException ex) {
                showError("Error saving file.");

            } catch (Exception ex) {
                showError(ex.getMessage());
            }
        });

        Scene scene = new Scene(grid, 400, 300);
        stage.setTitle("Registration Form");
        stage.setScene(scene);
        stage.show();
    }

    // Method to show error alert
    private void showError(String message) {
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle("Error");
        error.setHeaderText("Validation Failed");
        error.setContentText(message);
        error.showAndWait();
    }

    public static void main(String[] args) {
        launch();
    }
}
