import java.util.ArrayList;
import java.util.LinkedList;

public class Program4_ListPerformanceComparison {
    public static void main(String[] args) {
        int numberOfElements = 100000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        long arrayListStart = System.nanoTime();
        for (int number = 0; number < numberOfElements; number++) {
            arrayList.add(0, number);
        }
        long arrayListTime = System.nanoTime() - arrayListStart;

        LinkedList<Integer> linkedList = new LinkedList<>();
        long linkedListStart = System.nanoTime();
        for (int number = 0; number < numberOfElements; number++) {
            linkedList.addFirst(number);
        }
        long linkedListTime = System.nanoTime() - linkedListStart;

        System.out.println("ArrayList insertion time: " + arrayListTime + " ns");
        System.out.println("LinkedList insertion time: " + linkedListTime + " ns");
    }
}
