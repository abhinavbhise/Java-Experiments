import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Program4_DeleteStudentByRollNo {
    private static final String URL = "jdbc:mysql://localhost:3306/college";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        String query = "DELETE FROM Student WHERE RollNo = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, 1);

            int rowsDeleted = preparedStatement.executeUpdate();
            System.out.println(rowsDeleted + " student record(s) deleted.");
        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
}
