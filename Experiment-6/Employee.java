import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Employee
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter joining date (dd-MM-yyyy): ");
        String date = sc.nextLine();

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate joiningDate = LocalDate.parse(date, f);
        LocalDate today = LocalDate.now();

        Period p = Period.between(joiningDate, today);

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Joining Date: " + joiningDate.format(f));
        System.out.println("Work Experience: " + p.getYears() + " years, "
                + p.getMonths() + " months, " + p.getDays() + " days");

        sc.close();
    }
}