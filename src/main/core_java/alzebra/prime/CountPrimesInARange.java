package main.core_java.alzebra.prime;

import java.util.Scanner;

public class CountPrimesInARange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write Starting Point: ");
        int startingPoint = scanner.nextInt();
        System.out.print("Write Ending Point: ");
        int endingPoint = scanner.nextInt();
        boolean primeFound = false;
        int count = 0;
        if(startingPoint > endingPoint){
            System.out.println("Starting point must bigger than ending point.");
        }else {
            for(int i = startingPoint; i <= endingPoint; i++){
                if (isPrime(i)){
                    primeFound = true;
                    System.out.print(i + ", ");
                    count++;
                }
            }
            System.out.println();
            System.out.println("Total number of prime in this range is: "+count);
            if(!primeFound){
                System.out.println("No prime numbers found in the given range.");
            }
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
