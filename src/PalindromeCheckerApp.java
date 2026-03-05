public class PalindromeCheckerApp {

    // Method 1: Reverse String
    public static boolean reverseMethod(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return str.equals(reversed);
    }

    // Method 2: Two Pointer
    public static boolean twoPointerMethod(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        // Reverse method timing
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(word);
        long end1 = System.nanoTime();

        // Two pointer method timing
        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(word);
        long end2 = System.nanoTime();

        System.out.println("Reverse Method Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println();

        System.out.println("Two Pointer Method Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");
    }
}