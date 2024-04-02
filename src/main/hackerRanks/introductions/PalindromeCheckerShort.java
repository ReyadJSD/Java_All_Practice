package main.hackerRanks.introductions;

import java.util.Scanner;

public class PalindromeCheckerShort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
