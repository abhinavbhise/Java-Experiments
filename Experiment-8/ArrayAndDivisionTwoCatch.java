public class ArrayAndDivisionTwoCatch {
    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        int dividend = 10;
        int divisor = 0;

        try {
            System.out.println("Array element at index 5: " + values[5]);
            int result = dividend / divisor;
            System.out.println("Division result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }
    }
}
