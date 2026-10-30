import org.joda.time.LocalDate;

public class Program5_JodaTimeDateArithmetic {
    public static void main(String[] args) {
        LocalDate originalDate = new LocalDate(2026, 10, 8);
        LocalDate changedDate = originalDate.plusDays(10).plusMonths(2).plusYears(1);
        changedDate = changedDate.minusDays(3).minusMonths(1).minusYears(1);

        System.out.println("Original date: " + originalDate);
        System.out.println("After adding and subtracting time: " + changedDate);
    }
}
