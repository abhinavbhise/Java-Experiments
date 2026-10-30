import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudentNames {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("Riya");
        studentNames.add("Amit");
        studentNames.add("Sneha");
        studentNames.add("Karan");

        Collections.sort(studentNames, (firstName, secondName) -> firstName.compareTo(secondName));

        System.out.println("Student names in alphabetical order:");
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
    }
}
