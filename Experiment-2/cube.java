class cube {
    int length;
    int breadth;
    int height;

    cube() {
        length = 1;
        breadth = 1;
        height = 1;
    }

    cube(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    cube(int side) {
        length = side;
        breadth = side;
        height = side;
    }

    int volume() {
        return length * breadth * height;
    }

    void displayVolume() {
        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height = " + height);
        System.out.println("Volume = " + volume());
        System.out.println();
    }

    public static void main(String[] args) {
        cube obj1 = new cube();
        cube obj2 = new cube(2, 3, 4);
        cube obj3 = new cube(5);

        System.out.println("Object 1:");
        obj1.displayVolume();

        System.out.println("Object 2:");
        obj2.displayVolume();

        System.out.println("Object 3:");
        obj3.displayVolume();
    }
}
