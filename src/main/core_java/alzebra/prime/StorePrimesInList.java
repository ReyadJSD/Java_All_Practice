package main.core_java.alzebra.prime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StorePrimesInList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write Starting Point: ");
        int startingPoint = scanner.nextInt();
        System.out.print("Write Ending Point: ");
        int endingPoint = scanner.nextInt();

        List<Integer> primeList = new ArrayList<>(); // List to store prime numbers

        if(startingPoint > endingPoint){
            System.out.println("Starting point must be smaller than ending point.");
        }else {
            for(int i = startingPoint; i <= endingPoint; i++){
                if (isPrime(i)){
                    primeList.add(i); // Add prime number to the list
                }
            }
            if(primeList.isEmpty()){
                System.out.println("No prime numbers found in the given range.");
            } else {
                System.out.println("Prime numbers found in the given range: ");
                for (int i = 0; i < primeList.size() - 1; i++) {
                    System.out.print(primeList.get(i) + ", ");
                }
                System.out.println(primeList.get(primeList.size()-1)); // Move to the next line after printing the list
            }
        }
    }

    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
