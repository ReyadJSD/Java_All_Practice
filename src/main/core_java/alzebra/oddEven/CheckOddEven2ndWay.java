package main.core_java.alzebra.oddEven;

import java.util.Scanner;

public class CheckOddEven2ndWay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        checkOddEven(number);
    }
    public static void checkOddEven(int num){
        if(num % 2 == 0){
            System.out.println(num+" is Even number");
        }else {
            System.out.println(num+" is Odd number");
        }
    }
}
