public class StringToIntParseInt {
    public static void main(String[] args) {
        String input = "123a";

        try {
            int number = Integer.parseInt(input);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: '" + input + "' is not a valid integer.");
        }
    }
}
