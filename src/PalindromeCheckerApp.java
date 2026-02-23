public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Original string to check
        String original = "level";

        // Reverse the string using loop and concatenation
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed string using equals()
        if (original.equals(reversed)) {
            System.out.println("The string \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a palindrome.");
        }
    }
}
