public class Q4_ThreeTypePrinter {
    public static void main(String[] args) {
        Thread numbers = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Number: " + i);
            }
        });

        Thread alphabets = new Thread(() -> {
            for (char ch = 'A'; ch <= 'J'; ch++) {
                System.out.println("Alphabet: " + ch);
            }
        });

        Thread specials = new Thread(() -> {
            String symbols = "!@#$%^&*()";
            for (int i = 0; i < symbols.length(); i++) {
                System.out.println("Special: " + symbols.charAt(i));
            }
        });

        numbers.start();
        alphabets.start();
        specials.start();
    }
}
