public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block started.");

            try {
                int number = Integer.parseInt("25");
                System.out.println("Inner try block result: " + number);
                int result = 10 / 0;
                System.out.println("This line will not execute: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero.");
            }

            int[] data = new int[2];
            System.out.println(data[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index is out of bounds.");
        }
    }
}
