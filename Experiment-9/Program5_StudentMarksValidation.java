import java.util.Scanner;

class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class Program5_StudentMarksValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();

        try {
            validateMarks(marks);
            System.out.println("Valid student marks: " + marks);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100.");
        }
    }
}
