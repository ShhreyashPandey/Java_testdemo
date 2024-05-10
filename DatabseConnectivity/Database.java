import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

    public static Connection connectToDatabase() throws SQLException {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            private Connection connection;

            // Connect to the database
            String url = "jdbc:mysql://localhost:3306/employee";
            String username = "root";
            String password = "shreya123";
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
