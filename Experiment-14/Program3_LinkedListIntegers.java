import java.util.LinkedList;

public class Program3_LinkedListIntegers {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(5);
        System.out.println("After insertion: " + numbers);

        numbers.remove(Integer.valueOf(20));
        System.out.println("After deletion: " + numbers);
        System.out.println("Traversing elements:");
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
