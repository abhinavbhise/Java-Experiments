import java.util.Scanner;

class AuthenticationFailureException extends Exception {
    public AuthenticationFailureException() {
        super("Authentication Failure!");
    }
}

public class Program1_PasswordAuthentication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            authenticate(password);
            System.out.println("Authentication successful.");
        } catch (AuthenticationFailureException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void authenticate(String password) throws AuthenticationFailureException {
        if (!"java123".equals(password)) {
            throw new AuthenticationFailureException();
        }
    }
}
