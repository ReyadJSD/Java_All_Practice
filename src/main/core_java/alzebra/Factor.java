package main.core_java.alzebra;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(number < 1){
            System.out.println("Enter a valid number please");
        }else {
            checkFactors(number);
        }
    }
    public static void checkFactors(int num) {
        System.out.print("The Factors of the "+num+" are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
