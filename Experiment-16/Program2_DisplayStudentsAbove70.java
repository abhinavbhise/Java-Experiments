import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Program2_DisplayStudentsAbove70 {
    private static final String URL = "jdbc:mysql://localhost:3306/college";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        String query = "SELECT RollNo, Name FROM Student WHERE Percentage > ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setDouble(1, 70);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                System.out.println("Students with percentage greater than 70:");
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt("RollNo") + " - "
                            + resultSet.getString("Name"));
                }
            }
        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
}
