import java.util.HashSet;

public class Program4_CommonHashSetElements {
    public static void main(String[] args) {
        HashSet<Integer> firstSet = new HashSet<>();
        firstSet.add(10);
        firstSet.add(20);
        firstSet.add(30);

        HashSet<Integer> secondSet = new HashSet<>();
        secondSet.add(20);
        secondSet.add(30);
        secondSet.add(40);

        firstSet.retainAll(secondSet);
        System.out.println("Common elements: " + firstSet);
    }
}
