class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String str) {

        String reversed = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        // Compare original and reversed
        if (str.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeChecker checker = new PalindromeChecker();

        String word = "madam";

        if (checker.checkPalindrome(word)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is not a Palindrome");
        }
    }
}