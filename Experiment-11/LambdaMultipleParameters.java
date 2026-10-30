@FunctionalInterface
interface Addition {
    int add(int firstNumber, int secondNumber);
}

public class LambdaMultipleParameters {
    public static void main(String[] args) {
        Addition addition = (firstNumber, secondNumber) -> firstNumber + secondNumber;
        int result = addition.add(10, 20);

        System.out.println("Sum: " + result);
    }
}
