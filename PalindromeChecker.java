import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input a string
        System.out.print("Enter a string pranamya : ");
        String input = scanner.nextLine();
        
        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
        
        // Close the scanner object
        scanner.close();
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        // Loop through the string comparing characters from both ends
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }
        
        return true; // It's a palindrome
    }
}
