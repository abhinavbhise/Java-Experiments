class ArraySumTask implements Runnable {
    private final int[] arr;
    private final String name;

    public ArraySumTask(int[] arr, String name) {
        this.arr = arr;
        this.name = name;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        System.out.println(name + " sum = " + sum);
    }
}

public class Q8_ConcurrentArraySum {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 20, 30, 40, 50};
        int[] arr3 = {5, 10, 15, 20, 25};

        Thread t1 = new Thread(new ArraySumTask(arr1, "Array 1"));
        Thread t2 = new Thread(new ArraySumTask(arr2, "Array 2"));
        Thread t3 = new Thread(new ArraySumTask(arr3, "Array 3"));

        t1.start();
        t2.start();
        t3.start();
    }
}
