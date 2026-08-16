import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("Number of Characters: " + str.length());

        sc.close();
    }
}