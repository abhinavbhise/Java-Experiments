import java.util.Scanner;

public class StringToIntegerWrapper
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer in string format: ");
        String str = sc.nextLine();

        Integer number = Integer.valueOf(str);
        int primitiveValue = number.intValue();

        System.out.println("\nOriginal String : " + str);
        System.out.println("Wrapper Object  : " + number);
        System.out.println("Primitive Value : " + primitiveValue);

        sc.close();
    }
}