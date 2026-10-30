class WorkerThread implements Runnable {
    private final String name;
    private final int delay;

    public WorkerThread(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is working " + i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class Q6_JoinDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new WorkerThread("Thread A", 300));
        Thread t2 = new Thread(new WorkerThread("Thread B", 500));
        Thread t3 = new Thread(new WorkerThread("Thread C", 700));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("All threads have finished execution.");
    }
}
