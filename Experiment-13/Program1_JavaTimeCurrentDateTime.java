import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1_JavaTimeCurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Current date and time: " + currentDateTime.format(formatter));
    }
}
