package main.core_java.alzebra.factorial;

import java.util.Scanner;

public class CalcFactorialIterative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();
        System.out.println(calcFactorial(number));
    }

    public static long calcFactorial(long num){
        if(num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        long result = 1;
        for (int i = 1; i <= num; i++){
            result *= i;
        }
        return result;
    }
}
