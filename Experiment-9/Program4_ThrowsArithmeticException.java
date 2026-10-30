public class Program4_ThrowsArithmeticException {
    public static void main(String[] args) {
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception handled in the calling method: " + e.getMessage());
        }
    }

    private static void divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        System.out.println("Result: " + dividend / divisor);
    }
}
