import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        System.out.print("Enter the index: ");
        int index = sc.nextInt();

        System.out.print("Enter the new character: ");
        char ch = sc.next().charAt(0);

        if (index >= 0 && index < str.length()) {
            String newString = str.substring(0, index) + ch + str.substring(index + 1);
            System.out.println("Updated String: " + newString);
        } else {
            System.out.println("Invalid Index.");
        }

        sc.close();
    }
}