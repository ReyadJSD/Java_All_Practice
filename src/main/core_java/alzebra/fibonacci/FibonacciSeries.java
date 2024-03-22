package main.core_java.alzebra.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        generateFibonacci(number);
    }

    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        System.out.print(first + " " + second + " ");
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
