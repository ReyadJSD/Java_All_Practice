package main;

import java.util.Scanner;

public class ClassForPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter for your output: ");
        int number = scanner.nextInt();
        System.out.println("Factorial of "+number+" is: ");
        System.out.println(calcFactorial(number));
    }

    public static int calcFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
             result *= i;
        }
        return result;
    }
}
