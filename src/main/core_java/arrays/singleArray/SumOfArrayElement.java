package main.core_java.arrays.singleArray;

import java.util.Scanner;

public class SumOfArrayElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Array element: ");
        int arrSize = scanner.nextInt();
        int arr[] = new int[arrSize];

        System.out.println("Write the values of array: ");
        for(int i = 0; i < arrSize; i++){
            arr[i] = scanner.nextInt();
        }

        //print array
        System.out.print("Original Array: ");
        for(int i : arr){
            System.out.print(i +" ");
        }
        System.out.println();
        //Print Sum
        sumArrayElement(arr);
    }

    public static void sumArrayElement(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Sum of array element is: "+ sum);
    }
}
