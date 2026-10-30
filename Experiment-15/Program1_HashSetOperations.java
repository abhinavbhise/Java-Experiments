import java.util.HashSet;
import java.util.Set;

public class Program1_HashSetOperations {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Nashik");
        System.out.println("After insertion: " + cities);

        cities.remove("Pune");
        System.out.println("After deletion: " + cities);
        System.out.println("Mumbai found: " + cities.contains("Mumbai"));
        System.out.println("Set elements: " + cities);
    }
}
