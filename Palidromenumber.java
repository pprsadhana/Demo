package Selenium;
import java.util.Scanner;

public class Palidromenumber {  // Class name should be PalindromeNumber (properly capitalized)

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number = scanner.nextInt();

        // Check if the number is a palindrome
        if (isPalindrome(number)) {  // Call the correct method (isPalindrome)
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
        scanner.close();  // Close the scanner
    }

    // Method to check if the number is a palindrome
    public static boolean isPalindrome(int number) {  // Renamed the method to isPalindrome
        int originalNum = number;
        int reversedNum = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNum = reversedNum * 10 + digit;
            number /= 10;
        }

        // Return true if the original number is equal to the reversed number
        return originalNum == reversedNum;
    }
}
