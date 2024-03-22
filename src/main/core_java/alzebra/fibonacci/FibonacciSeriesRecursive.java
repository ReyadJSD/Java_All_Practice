package main.core_java.alzebra.fibonacci;

import java.util.Scanner;

public class FibonacciSeriesRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        for(int i = 0; i < number; i++){
            System.out.print(fibonacci(i)+" ");
        }

    }
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
