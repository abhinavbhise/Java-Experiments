@FunctionalInterface
interface Message {
    void display();
}

public class LambdaNoParameters {
    public static void main(String[] args) {
        Message message = () -> System.out.println("Hello from a lambda with no parameters.");
        message.display();
    }
}
