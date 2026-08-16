import java.util.Scanner;

public class LargestNumberWrapper
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number as a string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second number as a string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter third number as a string: ");
        String str3 = sc.nextLine();

        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);
        Integer num3 = Integer.valueOf(str3);

        int largest = num1;

        if (num2 > largest)
        {
            largest = num2;
        }

        if (num3 > largest)
        {
            largest = num3;
        }

        System.out.println("\nFirst Number  : " + num1);
        System.out.println("Second Number : " + num2);
        System.out.println("Third Number  : " + num3);
        System.out.println("Largest Number: " + largest);

        sc.close();
    }
}