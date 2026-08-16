import java.util.Scanner;

public class EvenOddLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int length = str.length();

        if (length % 2 == 0) {
            System.out.println("Length of the string is Even.");
        } else {
            System.out.println("Length of the string is Odd.");
        }

        sc.close();
    }
}