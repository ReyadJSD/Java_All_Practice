package main.core_java.arrays.singleArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindOddEvenListFromArray {
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
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                even.add(arr[i]);
            }else {
                odd.add(arr[i]);
            }
        }
        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
    }
}
