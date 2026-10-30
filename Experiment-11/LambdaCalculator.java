@FunctionalInterface
interface Operation {
    double calculate(double firstNumber, double secondNumber);
}

public class LambdaCalculator {
    public static void main(String[] args) {
        double firstNumber = 20;
        double secondNumber = 5;

        Operation addition = (first, second) -> first + second;
        Operation subtraction = (first, second) -> first - second;
        Operation multiplication = (first, second) -> first * second;
        Operation division = (first, second) -> first / second;

        System.out.println("Addition: " + addition.calculate(firstNumber, secondNumber));
        System.out.println("Subtraction: " + subtraction.calculate(firstNumber, secondNumber));
        System.out.println("Multiplication: " + multiplication.calculate(firstNumber, secondNumber));

        if (secondNumber != 0) {
            System.out.println("Division: " + division.calculate(firstNumber, secondNumber));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}
