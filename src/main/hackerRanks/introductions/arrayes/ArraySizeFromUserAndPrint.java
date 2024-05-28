package main.hackerRanks.introductions.arrayes;

import java.io.IOException;
import java.util.Scanner;

public class ArraySizeFromUserAndPrint {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        System.out.print("Write a array size: ");
        int n = scan.nextInt();
        System.out.println("Write values: ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        for(int num : arr)
            System.out.println(num);

    }
}
