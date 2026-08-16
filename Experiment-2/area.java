class AreaData {
    int length;
    int breadth;
    int radius;
    int side;

    AreaData(int l, int b, int r, int s) {
        length = l;
        breadth = b;
        radius = r;
        side = s;
    }

    AreaData(AreaData a) {
        length = a.length;
        breadth = a.breadth;
        radius = a.radius;
        side = a.side;
    }

    void display() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Radius = " + radius);
        System.out.println("Side = " + side);
        System.out.println("Area of Rectangle = " + (length * breadth));
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
        System.out.println("Area of Square = " + (side * side));
    }
}

public class area {
    public static void main(String[] args) {
        AreaData a1 = new AreaData(10, 5, 7, 4);

        AreaData a2 = new AreaData(a1);

        System.out.println("Original Object:");
        a1.display();

        System.out.println();

        System.out.println("Copied Object:");
        a2.display();
    }
}
