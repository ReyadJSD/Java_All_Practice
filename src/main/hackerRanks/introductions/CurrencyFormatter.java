package main.hackerRanks.introductions;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a amount in double format: ");
        double amount = scanner.nextDouble();

        // US currency format
        String usFormatted = NumberFormat.getCurrencyInstance(Locale.US).format(amount);

        // Indian currency format
        Locale indiaLocale = new Locale("en", "IN");
        String indiaFormatted = NumberFormat.getCurrencyInstance(indiaLocale).format(amount);

        // Chinese currency format
        String chinaFormatted = NumberFormat.getCurrencyInstance(Locale.CHINA).format(amount);

        // French currency format
        String franceFormatted = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(amount);

        // Print formatted values
        System.out.println("US: " + usFormatted);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + chinaFormatted);
        System.out.println("France: " + franceFormatted);
    }
}

