import java.util.ArrayList;

public class Program2_ArrayListStudentNames {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        studentNames.add("Amit");
        studentNames.add("Riya");
        studentNames.add("Sneha");
        studentNames.add("Karan");

        System.out.println("Student names:");
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
    }
}
