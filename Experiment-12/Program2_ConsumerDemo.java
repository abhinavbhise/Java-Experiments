import java.util.function.Consumer;

public class Program2_ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> display = message -> System.out.println("Message: " + message);
        display.accept("Consumer accepts one value and returns nothing.");
    }
}
