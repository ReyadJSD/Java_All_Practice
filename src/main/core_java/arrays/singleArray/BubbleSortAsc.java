package main.core_java.arrays.singleArray;

public class BubbleSortAsc {
    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 8, 5, 7, 9};
        System.out.print("Original Array: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();

        bubbleSortAsc(arr);

        System.out.print("Sorted Array: ");
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void bubbleSortAsc(int arr[]){
        int length = arr.length;
        boolean swapped;
        for(int i = 0; i < length - 1; i++){
            swapped = false;
            for(int j = 0; j < length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

}
