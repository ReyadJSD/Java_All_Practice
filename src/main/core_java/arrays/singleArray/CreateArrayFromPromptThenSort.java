package main.core_java.arrays.singleArray;

import java.util.Scanner;

public class CreateArrayFromPromptThenSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int number = scanner.nextInt();
        int arr[] = new int[number];
        //Set values in the array by prompt
        System.out.print("Write the value of Array: ");
        for(int i = 0; i < number; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.print("Original Array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();
        sortPromptArray(arr);

        System.out.print("Sorted Array: ");
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void sortPromptArray(int arr[]){
        int length = arr.length;
        boolean swapped;
        for(int i = 0; i < length - 1; i++){
            swapped = false;
            for (int j = 0; j < length -1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
