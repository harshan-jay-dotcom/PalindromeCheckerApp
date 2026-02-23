public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // String to check
        String original = "radar";

        // Convert string to character array
        char[] chars = original.toCharArray();

        // Two-pointer approach
        int left = 0;
        int right = chars.length - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The string \"" + original + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + original + "\" is NOT a palindrome.");
        }
    }
}
