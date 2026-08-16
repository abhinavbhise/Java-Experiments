import java.util.Scanner;

interface FY {
    void getFYData();
}

interface SY {
    void getSYData();
}

class Student implements FY, SY {
    int rollno;
    String name;
    String result;

    Scanner sc = new Scanner(System.in);

    public void getFYData() {
        System.out.print("Enter Roll No: ");
        rollno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    public void getSYData() {
        System.out.print("Enter Result: ");
        result = sc.nextLine();
    }

    void display() {
        System.out.println("\nStudent Information");
        System.out.println("----------------------------");
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Result: " + result);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Student s = new Student();

        s.getFYData();
        s.getSYData();
        s.display();
    }
}