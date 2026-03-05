public class PalindromeCheckerApp // File Name: UseCase1PalindromeCheckerApp.java

 {
    // UC1: Display Welcome Message
    public static void showWelcome() {
        System.out.println("===========================================");
        System.out.println("     Welcome to Palindrome Checker App     ");
        System.out.println("     Version: 1.0.0                        ");
        System.out.println("===========================================");
        System.out.println("Application is starting...");
    }

    // Main Method – Program Entry
    public static void main(String[] args) {
        // Display welcome message
        showWelcome();

        // Here the program can continue to next use case or exit
        System.out.println("Proceeding to palindrome processing...");
    }
}
