import java.util.Scanner;

public class CalculatorWrapper
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number as a string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second number as a string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);

        switch (op)
        {
            case '+':
                System.out.println("Result = " + (num1 + num2));
                break;

            case '-':
                System.out.println("Result = " + (num1 - num2));
                break;

            case '*':
                System.out.println("Result = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0)
                {
                    System.out.println("Result = " + (num1 / num2));
                }
                else
                {
                    System.out.println("Division by zero is not possible.");
                }
                break;

            default:
                System.out.println("Invalid operation.");
        }

        sc.close();
    }
}
