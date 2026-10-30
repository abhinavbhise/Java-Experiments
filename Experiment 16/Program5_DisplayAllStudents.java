import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program5_DisplayAllStudents {
    private static final String URL = "jdbc:mysql://localhost:3306/college";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        String query = "SELECT RollNo, Name, Percentage FROM Student";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query)) {
            System.out.println("Roll No\tName\tPercentage");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("RollNo") + "\t"
                        + resultSet.getString("Name") + "\t"
                        + resultSet.getDouble("Percentage"));
            }
        } catch (Exception exception) {
            System.out.println("Database error: " + exception.getMessage());
        }
    }
}
