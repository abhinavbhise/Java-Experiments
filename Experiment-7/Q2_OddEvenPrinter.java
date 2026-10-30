class OddEvenShared {
    int turn = 1; // 1 for odd, 2 for even

    synchronized void printOdd() throws InterruptedException {
        for (int i = 1; i <= 20; i += 2) {
            while (turn != 1) {
                wait();
            }
            System.out.println("Odd Thread: " + i);
            turn = 2;
            notify();
        }
    }

    synchronized void printEven() throws InterruptedException {
        for (int i = 2; i <= 20; i += 2) {
            while (turn != 2) {
                wait();
            }
            System.out.println("Even Thread: " + i);
            turn = 1;
            notify();
        }
    }
}

public class Q2_OddEvenPrinter {
    public static void main(String[] args) {
        OddEvenShared shared = new OddEvenShared();

        Thread odd = new Thread(() -> {
            try {
                shared.printOdd();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread even = new Thread(() -> {
            try {
                shared.printEven();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        odd.start();
        even.start();
    }
}
