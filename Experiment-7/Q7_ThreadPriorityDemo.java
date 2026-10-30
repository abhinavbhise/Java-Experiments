public class Q7_ThreadPriorityDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 priority = " + Thread.currentThread().getPriority() + " value = " + i);
            }
        }, "T1");

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2 priority = " + Thread.currentThread().getPriority() + " value = " + i);
            }
        }, "T2");

        Thread t3 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 3 priority = " + Thread.currentThread().getPriority() + " value = " + i);
            }
        }, "T3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}
