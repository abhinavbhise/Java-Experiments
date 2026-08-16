class MobileDetails {
    String company_name;
    double screen_size;

    MobileDetails(String c, double s) {
        company_name = c;
        screen_size = s;
    }

    void display() {
        System.out.println("Company Name: " + company_name);
        System.out.println("Screen Size: " + screen_size + " inches");
        System.out.println();
    }
}

public class mobile {
    public static void main(String[] args) {
        MobileDetails m1 = new MobileDetails("Samsung", 6.5);
        MobileDetails m2 = new MobileDetails("Apple", 6.1);
        MobileDetails m3 = new MobileDetails("OnePlus", 6.7);
        MobileDetails m4 = new MobileDetails("Xiaomi", 6.6);
        MobileDetails m5 = new MobileDetails("Realme", 6.4);

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
    }
}