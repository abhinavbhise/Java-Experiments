import java.util.Scanner;

class Person {
    String name;
    int age;

    void walk() {
        System.out.println(name + " is walking.");
    }
}

class Student extends Person {
    int rollNo;

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

interface Sport {
    void play();
}

class SportStudents extends Student implements Sport {

    public void play() {
        System.out.println(name + " is playing sports.");
    }
}

public class SportStudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SportStudents s = new SportStudents();

        System.out.println("Enter Student Details");

        System.out.print("Enter Roll No: ");
        s.rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        s.name = sc.nextLine();

        System.out.print("Enter Age: ");
        s.age = sc.nextInt();

        System.out.println("\nSport Student Details");
        System.out.println("----------------------------");

        s.displayStudent();
        s.walk();
        s.play();

        sc.close();
    }
}