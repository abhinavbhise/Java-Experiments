package useful;

import java.util.Scanner;

public class useme
{
    Scanner sc = new Scanner(System.in);

    public void area()
    {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        System.out.println("Area = " + (3.14 * r * r));
    }

    public void salary()
    {
        System.out.print("Enter basic salary: ");
        double s = sc.nextDouble();
        System.out.println("Salary = " + (s + s * 0.10));
    }

    public void percentage()
    {
        System.out.print("Enter marks of 5 subjects: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();

        System.out.println("Percentage = " + ((a + b + c + d + e) / 5));
    }
}