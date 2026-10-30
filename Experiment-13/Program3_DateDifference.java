import java.time.LocalDate;
import java.time.Period;

public class Program3_DateDifference {
    public static void main(String[] args) {
        LocalDate firstDate = LocalDate.of(2024, 1, 15);
        LocalDate secondDate = LocalDate.of(2025, 6, 20);
        Period difference = Period.between(firstDate, secondDate);

        System.out.println("Difference: " + difference.getYears() + " years, "
                + difference.getMonths() + " months, " + difference.getDays() + " days");
    }
}
