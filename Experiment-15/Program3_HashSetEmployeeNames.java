import java.util.HashSet;

public class Program3_HashSetEmployeeNames {
    public static void main(String[] args) {
        HashSet<String> employeeNames = new HashSet<>();
        employeeNames.add("Anita");
        employeeNames.add("Rahul");
        employeeNames.add("Meena");

        System.out.println("Employee names:");
        for (String employeeName : employeeNames) {
            System.out.println(employeeName);
        }
    }
}
