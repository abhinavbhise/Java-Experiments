import java.util.function.Function;

public class Program4_FunctionDemo {
    public static void main(String[] args) {
        Function<String, Integer> length = text -> text.length();
        String text = "Functional Interface";

        System.out.println("Text: " + text);
        System.out.println("Length: " + length.apply(text));
    }
}
