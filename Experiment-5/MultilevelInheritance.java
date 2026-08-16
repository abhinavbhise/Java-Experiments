import java.util.Scanner;

class Book {
    String author;
    String title;
    String publisher;
}

class BookInfo extends Book {
    double price;
    int stockPosition;
}

class BookSales extends BookInfo {
    int noOfCopiesSold;

    void revenueGenerated() {
        double revenue = price * noOfCopiesSold;
        System.out.println("Revenue Generated: " + revenue);
    }

    void allShow() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock Position: " + stockPosition);
        System.out.println("Number of Copies Sold: " + noOfCopiesSold);
        revenueGenerated();
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BookSales b = new BookSales();

        System.out.println("Enter Book Details");

        System.out.print("Author: ");
        b.author = sc.nextLine();

        System.out.print("Title: ");
        b.title = sc.nextLine();

        System.out.print("Publisher: ");
        b.publisher = sc.nextLine();

        System.out.print("Price: ");
        b.price = sc.nextDouble();

        System.out.print("Stock Position: ");
        b.stockPosition = sc.nextInt();

        System.out.print("Number of Copies Sold: ");
        b.noOfCopiesSold = sc.nextInt();

        System.out.println("\nComplete Book Information");
        System.out.println("============================");

        b.allShow();

        sc.close();
    }
}