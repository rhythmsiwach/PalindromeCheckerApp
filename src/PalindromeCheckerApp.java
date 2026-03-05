// File Name: UseCase3PalindromeCheckerApp.java

import java.util.Scanner;

public class PalindromeCheckerApp {

    // UC3: Check palindrome by reversing string
    public static void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String original = sc.nextLine();   // original string
        String reversed = "";

        // Reverse the string using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);  // string concatenation
        }

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }

    // Main method – program entry
    public static void main(String[] args) {
        System.out.println("==== UC3: Palindrome Check Using String Reverse ====");

        // Call method to check palindrome
        checkPalindrome();

        System.out.println("Program execution completed.");
    }
}