class NumberController {
    int turn = 1; 

    synchronized void firstThread() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            while (turn != 1) {
                wait();
            }
            System.out.println("Thread 1: " + i);
            if (i == 2) {
                turn = 2;
                notifyAll();
                Thread.sleep(100);
            } else if (i < 10) {
                turn = 2;
                notifyAll();
            } else {
                turn = 2;
                notifyAll();
            }
        }
    }

    synchronized void secondThread() throws InterruptedException {
        for (int i = 10; i >= 1; i--) {
            while (turn != 2) {
                wait();
            }
            System.out.println("Thread 2: " + i);
            turn = 1;
            notifyAll();
        }
    }
}

public class Q1_ThreadTransfer1To10 {
    public static void main(String[] args) {
        NumberController controller = new NumberController();

        Thread t1 = new Thread(() -> {
            try {
                controller.firstThread();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                controller.secondThread();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();
    }
}
