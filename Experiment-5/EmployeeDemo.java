import java.util.Scanner;

class Employee {
    String name;
    double salary;

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    double bonus;

    void displayManager() {
        System.out.println("\nManager Details");
        System.out.println("----------------------");
        displayEmployee();
        System.out.println("Bonus: " + bonus);
    }
}

class Clerk extends Employee {
    double allowance;

    void displayClerk() {
        System.out.println("\nClerk Details");
        System.out.println("----------------------");
        displayEmployee();
        System.out.println("Allowance: " + allowance);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Manager m = new Manager();

        System.out.println("Enter Manager Details");
        System.out.print("Enter Name: ");
        m.name = sc.nextLine();

        System.out.print("Enter Salary: ");
        m.salary = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        m.bonus = sc.nextDouble();
        sc.nextLine();

        Clerk c = new Clerk();

        System.out.println("\nEnter Clerk Details");
        System.out.print("Enter Name: ");
        c.name = sc.nextLine();

        System.out.print("Enter Salary: ");
        c.salary = sc.nextDouble();

        System.out.print("Enter Allowance: ");
        c.allowance = sc.nextDouble();

        m.displayManager();
        c.displayClerk();

        sc.close();
    }
}