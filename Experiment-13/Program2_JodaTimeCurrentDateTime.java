import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Program2_JodaTimeCurrentDateTime {
    public static void main(String[] args) {
        DateTime currentDateTime = new DateTime();
        DateTimeFormatter formatter = DateTimeFormat.forPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("Current date and time: " + formatter.print(currentDateTime));
    }
}
