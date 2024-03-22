package main.core_java.alzebra.prime;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(isPrime(number)){
            System.out.println(number+" is a Prime number");
        }else {
            System.out.println(number+" is not a Prime number");
        }

    }
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
