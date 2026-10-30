@FunctionalInterface
interface NumberPrinter {
    void print(int number);
}

public class LambdaSingleParameter {
    public static void main(String[] args) {
        NumberPrinter printer = number -> System.out.println("The number is: " + number);
        printer.print(25);
    }
}
