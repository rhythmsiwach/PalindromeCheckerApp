public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String text = "Madam Im Adam";

        // Normalize the string (remove spaces and convert to lowercase)
        String normalized = text.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        // Reverse the normalized string
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Check palindrome
        if (normalized.equals(reversed)) {
            System.out.println(text + " is a Palindrome (Ignoring case and spaces)");
        } else {
            System.out.println(text + " is not a Palindrome");
        }
    }
}