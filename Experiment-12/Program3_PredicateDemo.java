import java.util.function.Predicate;

public class Program3_PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        int number = 24;

        System.out.println(number + " is even: " + isEven.test(number));
    }
}
