import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeManager {
    private Connection connection;

    public static void registerEmployee(TextField idField, TextField nameField, TextField ageField, TextField emailField, TextField departmentField) {
        try {
            Connection connection = Database.connectToDatabase();

            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String email = emailField.getText();
            String department = departmentField.getText();

            String sql = "INSERT INTO Employee (name, age, email, department) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.setString(3, email);
            statement.setString(4, department);
            statement.executeUpdate();

            System.out.println("Employee registered successfully");
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private void createEmployeeTable() {
        try {
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS Employee (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(100), " +
                    "age INT, " +
                    "email VARCHAR(100), " +
                    "department VARCHAR(100)" +
                    ")";
            statement.executeUpdate(sql);
            System.out.println("Employee table created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void registerEmployee() {
        try {
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String email = emailField.getText();
            String department = departmentField.getText();

            String sql = "INSERT INTO Employee (name, age, email, department) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.setString(3, email);
            statement.setString(4, department);
            statement.executeUpdate();

            System.out.println("Employee registered successfully");
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private void viewEmployees() {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Employee");
            while (resultSet.next()) {
                System.out.println(
                        "ID: " + resultSet.getInt("id") +
                                ", Name: " + resultSet.getString("name") +
                                ", Age: " + resultSet.getInt("age") +
                                ", Email: " + resultSet.getString("email") +
                                ", Department: " + resultSet.getString("department")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void updateEmployee(TextField idField, TextField nameField, TextField ageField, TextField emailField, TextField departmentField) {
        try {
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            int age = Integer.parseInt(ageField.getText());
            String email = emailField.getText();
            String department = departmentField.getText();

            String sql = "UPDATE Employee SET name=?, age=?, email=?, department=? WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.setString(3, email);
            statement.setString(4, department);
            statement.setInt(5, id);
            statement.executeUpdate();

            System.out.println("Employee information updated successfully");
        } catch (SQLException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
