import java.util.Scanner;

public class SumOfStringNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number as a string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second number as a string: ");
        String str2 = sc.nextLine();

        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);

        int sum = num1.intValue() + num2.intValue();

        System.out.println("\nFirst Number  : " + num1);
        System.out.println("Second Number : " + num2);
        System.out.println("Sum           : " + sum);

        sc.close();
    }
}