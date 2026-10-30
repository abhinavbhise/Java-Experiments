public class ArrayIndexTryCatchFinally {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.println("Element at index 2: " + numbers[2]);
            System.out.println("Element at index 7: " + numbers[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
