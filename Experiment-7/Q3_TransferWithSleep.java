class SleepController {
    int turn = 1; // 1 -> first thread, 2 -> second thread

    synchronized void firstThread() throws InterruptedException {
        for (int i = 10; i <= 20; i++) {
            while (turn != 1) {
                wait();
            }
            System.out.println("Thread 1: " + i);
            if (i == 11) {
                turn = 2;
                notifyAll();
                Thread.sleep(200);
            } else {
                turn = 2;
                notifyAll();
            }
        }
    }

    synchronized void secondThread() throws InterruptedException {
        for (int i = 20; i >= 1; i--) {
            while (turn != 2) {
                wait();
            }
            System.out.println("Thread 2: " + i);
            if (i == 19) {
                turn = 1;
                notifyAll();
                Thread.sleep(200);
            } else {
                turn = 1;
                notifyAll();
            }
        }
    }
}

public class Q3_TransferWithSleep {
    public static void main(String[] args) {
        SleepController controller = new SleepController();

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
