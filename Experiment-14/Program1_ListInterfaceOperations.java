import java.util.ArrayList;
import java.util.List;

public class Program1_ListInterfaceOperations {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>();
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("Database");
        System.out.println("After insertion: " + subjects);

        subjects.remove("Python");
        System.out.println("After deletion: " + subjects);
        System.out.println("Java found: " + subjects.contains("Java"));
        System.out.println("List elements: " + subjects);
    }
}
