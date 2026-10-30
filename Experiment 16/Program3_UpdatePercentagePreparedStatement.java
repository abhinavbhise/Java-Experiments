import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Program3_UpdatePercentagePreparedStatement {
    private static final String URL = "jdbc:mysql://localhost:3306/college";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        String query = "UPDATE Student SET Percentage = ? WHERE RollNo = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setDouble(1, 90.0);
            preparedStatement.setInt(2, 1);

            int rowsUpdated = preparedStatement.executeUpdate();
            System.out.println(rowsUpdated + " student record(s) updated.");
        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
}
