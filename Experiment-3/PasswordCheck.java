import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String setPassword = "java123";

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (password.equals(setPassword)) {
            System.out.println("Password is Correct");
        } else {
            System.out.println("Password is Incorrect");
        }

        sc.close();
    }
}