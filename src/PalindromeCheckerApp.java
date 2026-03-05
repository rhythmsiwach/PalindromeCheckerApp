public class PalindromeCheckerApp // File Name: UseCase1PalindromeCheckerApp.java

// File Name: UseCase2PalindromeCheckerApp.java

{

    // UC2: Hardcoded Palindrome Check
    public static void hardcodedPalindrome() {
        // Hardcoded string to check
        String word = "madam";
        String reverse = "";

        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        // Check if palindrome
        if (word.equals(reverse)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }

    // Main method – entry point
    public static void main(String[] args) {
        System.out.println("==== UC2: Hardcoded Palindrome Checker ====");

        // Call the palindrome check method
        hardcodedPalindrome();

        System.out.println("Program execution completed.");
    }
}