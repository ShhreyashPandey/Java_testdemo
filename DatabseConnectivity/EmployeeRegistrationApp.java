import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.sql.*;

public class EmployeeRegistrationApp extends Application {

    private Connection connection;
    private TextField idField, nameField, ageField, emailField, departmentField;

    @Override
    public void start(Stage primaryStage) {
        // Initialize database connection
        connectToDatabase();

        // Create UI components
        idField = new TextField();
        idField.setPromptText("Employee ID");
        nameField = new TextField();
        nameField.setPromptText("Name");
        ageField = new TextField();
        ageField.setPromptText("Age");
        emailField = new TextField();
        emailField.setPromptText("Email");
        departmentField = new TextField();
        departmentField.setPromptText("Department");

        Button createTableButton = new Button("Create Employee Table");
        createTableButton.setOnAction(e -> createEmployeeTable());

        Button registerButton = new Button("Register Employee");
        registerButton.setOnAction(e -> registerEmployee());

        Button viewButton = new Button("View Employees");
        viewButton.setOnAction(e -> viewEmployees());

        Button updateButton = new Button("Update Employee");
        updateButton.setOnAction(e -> updateEmployee());

        // Layout
        VBox root = new VBox(10);
        root.getChildren().addAll(
                idField, nameField, ageField, emailField, departmentField,
                createTableButton, registerButton, viewButton, updateButton
        );

        // Scene
        Scene scene = new Scene(root, 400, 300);

        // Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Employee Registration App");
        primaryStage.show();
    }
}