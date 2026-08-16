public class ReverseAndSum {
    public static void main(String[] args) {
        int n = 1234;
        int temp = n;
        int rev = 0;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            sum = sum + digit;
            temp = temp / 10;
        }

        System.out.println("Reverse = " + rev);
        System.out.println("Sum = " + sum);
    }
}
