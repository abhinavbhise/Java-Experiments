import java.util.Scanner;

class Book {
    String author;
    String title;
    String publisher;
}

class BookInfo extends Book {
    double price;
    int stockPosition;

    void show() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock Position: " + stockPosition);
        System.out.println("----------------------------");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookInfo b1 = new BookInfo();
        BookInfo b2 = new BookInfo();
        BookInfo b3 = new BookInfo();

        System.out.println("Enter details of Book 1:");
        System.out.print("Author: ");
        b1.author = sc.nextLine();
        System.out.print("Title: ");
        b1.title = sc.nextLine();
        System.out.print("Publisher: ");
        b1.publisher = sc.nextLine();
        System.out.print("Price: ");
        b1.price = sc.nextDouble();
        System.out.print("Stock Position: ");
        b1.stockPosition = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter details of Book 2:");
        System.out.print("Author: ");
        b2.author = sc.nextLine();
        System.out.print("Title: ");
        b2.title = sc.nextLine();
        System.out.print("Publisher: ");
        b2.publisher = sc.nextLine();
        System.out.print("Price: ");
        b2.price = sc.nextDouble();
        System.out.print("Stock Position: ");
        b2.stockPosition = sc.nextInt();
        sc.nextLine();

        System.out.println("\nEnter details of Book 3:");
        System.out.print("Author: ");
        b3.author = sc.nextLine();
        System.out.print("Title: ");
        b3.title = sc.nextLine();
        System.out.print("Publisher: ");
        b3.publisher = sc.nextLine();
        System.out.print("Price: ");
        b3.price = sc.nextDouble();
        System.out.print("Stock Position: ");
        b3.stockPosition = sc.nextInt();

        System.out.println("\nBook Information");
        System.out.println("============================");

        b1.show();
        b2.show();
        b3.show();

        sc.close();
    }
}
