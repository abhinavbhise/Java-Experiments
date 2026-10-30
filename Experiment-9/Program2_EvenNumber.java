import java.util.Scanner;

class OddNumberException extends Exception {
    public OddNumberException() {
        super("The number is not even.");
    }
}

public class Program2_EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        try {
            validateEven(number);
            System.out.println(number + " is even.");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateEven(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException();
        }
    }
}
