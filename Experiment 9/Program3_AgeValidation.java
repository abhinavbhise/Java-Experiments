import java.util.Scanner;

class UnderAgeException extends Exception {
    public UnderAgeException() {
        super("Age is less than 18 years.");
    }
}

public class Program3_AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            validateAge(age);
            System.out.println("The person is eligible.");
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException();
        }
    }
}
