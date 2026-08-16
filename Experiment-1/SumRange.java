public class SumRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i >= start && i <= end) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
