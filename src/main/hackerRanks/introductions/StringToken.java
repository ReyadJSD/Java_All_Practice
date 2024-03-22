package main.hackerRanks.introductions;

import java.util.Scanner;

public class StringToken {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a sentence: ");
        String input = scanner.nextLine().trim();

        // Split the input string into tokens
        String[] tokens = input.split("[ !,?._'@]+");

        // Print the number of tokens
        System.out.println(tokens.length);

        // Print each token on a new line
        for (String token : tokens) {
            System.out.println(token);
        }

        scanner.close();
    }
}
