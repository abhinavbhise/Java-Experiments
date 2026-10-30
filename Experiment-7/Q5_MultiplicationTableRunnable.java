class TableRunnable implements Runnable {
    private final int table;

    public TableRunnable(int table) {
        this.table = table;
    }

    @Override
    public void run() {
        System.out.println("Table for " + table + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }
        System.out.println();
    }
}

public class Q5_MultiplicationTableRunnable {
    public static void main(String[] args) {
        Thread t2 = new Thread(new TableRunnable(2));
        Thread t3 = new Thread(new TableRunnable(3));
        Thread t5 = new Thread(new TableRunnable(5));
        Thread t7 = new Thread(new TableRunnable(7));

        t2.start();
        t3.start();
        t5.start();
        t7.start();
    }
}
