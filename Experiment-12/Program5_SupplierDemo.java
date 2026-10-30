import java.util.function.Supplier;

public class Program5_SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> message = () -> "Supplier provides a value without taking input.";
        System.out.println(message.get());
    }
}
