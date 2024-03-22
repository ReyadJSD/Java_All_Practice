package main.core_java.alzebra.factorial;

import java.util.Scanner;

public class CalcFactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        System.out.println(calcFactorial(number));
    }
    public static long calcFactorial(long num) {
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calcFactorial(num - 1);
    }
}
