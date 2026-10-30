import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Program1_CreateStudentTableInsert {
    private static final String URL = "jdbc:mysql://localhost:3306/college";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        String createTable = "CREATE TABLE IF NOT EXISTS Student ("
                + "RollNo INT PRIMARY KEY, Name VARCHAR(100), Percentage DOUBLE)";
        String insertStudent = "INSERT INTO Student (RollNo, Name, Percentage) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement();
                PreparedStatement preparedStatement = connection.prepareStatement(insertStudent)) {
            statement.executeUpdate(createTable);

            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Amit");
            preparedStatement.setDouble(3, 85.5);
            preparedStatement.executeUpdate();

            System.out.println("Student table created and record inserted.");
        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
}
