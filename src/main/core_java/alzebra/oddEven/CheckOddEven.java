package main.core_java.alzebra.oddEven;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(checkOddEven(number)){
            System.out.println(number + " is Even Number");
        }else {
            System.out.println(number + " is Odd Number");
        }

    }
    public static boolean checkOddEven(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
}
