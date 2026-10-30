import java.util.ArrayList;
import java.util.HashSet;

public class Program5_HashSetToArrayList {
    public static void main(String[] args) {
        HashSet<String> subjects = new HashSet<>();
        subjects.add("Java");
        subjects.add("Database");
        subjects.add("Networking");

        ArrayList<String> subjectList = new ArrayList<>(subjects);
        System.out.println("ArrayList elements: " + subjectList);
    }
}
