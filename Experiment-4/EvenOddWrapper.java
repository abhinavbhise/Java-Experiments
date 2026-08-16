import java.util.Scanner;

public class EvenOddWrapper
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number as a string: ");
        String str = sc.nextLine();

        Integer number = Integer.valueOf(str);
        int value = number.intValue();

        System.out.println("\nOriginal String : " + str);
        System.out.println("Wrapper Object  : " + number);

        if (value % 2 == 0)
        {
            System.out.println("The number is Even.");
        }
        else
        {
            System.out.println("The number is Odd.");
        }

        sc.close();
    }
}