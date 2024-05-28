package main.core_java.arrays.singleArray;

import java.util.Scanner;

public class FindOddEvenFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arrSize = scanner.nextInt();
        int arr[] = new int[arrSize];
        System.out.println("Write the value of array: ");
        for(int i = 0; i < arrSize; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Original Array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        printOddEven(arr);
    }

    public static void printOddEven(int arr[]){
        System.out.print("Even number of the array: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Odd number of the array: ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
