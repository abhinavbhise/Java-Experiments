@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class Program1_UserDefinedFunctionalInterface {
    public static void main(String[] args) {
        Greeting greeting = name -> System.out.println("Hello, " + name + "!");
        greeting.sayHello("Student");
    }
}
