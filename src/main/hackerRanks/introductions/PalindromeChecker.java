package main.hackerRanks.introductions;

import java.util.Scanner;

public class PalindromeChecker {
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
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
