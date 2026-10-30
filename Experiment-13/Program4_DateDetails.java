import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program4_DateDetails {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, 10, 8);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Date: " + date.format(formatter));
        System.out.println("Day: " + date.getDayOfWeek());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Year: " + date.getYear());
    }
}
