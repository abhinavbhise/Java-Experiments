class Student {
    String name;
    String dept;
    int rollno;
    int marks;

    Student() {
        name = "Abhinav";
        dept = "Computer";
        rollno = 101;
        marks = 85;
    }

    Student(String n, String d, int r, int m) {
        name = n;
        dept = d;
        rollno = r;
        marks = m;
    }

    Student(String n) {
        name = n;
        dept = "IT";
        rollno = 102;
        marks = 90;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("Roll No: " + rollno);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sahil", "Electronics", 103, 88);
        Student s3 = new Student("Sanat");

        s1.display();
        s2.display();
        s3.display();
    }
}