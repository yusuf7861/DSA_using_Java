package dsa_using_java.Arrays;

import java.util.Scanner;

public class Array_ADT {
    public static void main(String[] args) {
        /*
         * Data: Array Space Size Length(no. of elements)
         * 
         * Operations: Display() Add(x) / append(x) Insert(index, x) Delete(index, x)
         * Search(x) Get(x) Set(index, x) max() / min() reverse() shift() / rotate()
         */

        // Create an array with a size of 10
        int[] arr = new int[10];
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Ensure n is not greater than the array size
        if (n > arr.length) {
            System.out.println("Number of elements exceeds array size.");
            return;
        }

        // Populate the array with user input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        // Length of the array
        int len = n;
        System.out.println("Length: " + len);

        // Operations:
        // Display the array elements
        display(n, arr);

        // Add(x) / append(x)
        // Ensure the array has space for the new element
        if (len < arr.length) {
            int x = 10;
            arr[len] = x;
            len++;
        } else {
            System.out.println("Array is full. Cannot append new element.");
        }

        // Display the array after appending
        display(len, arr);
    }

    // Display the elements of the array
    public static void display(int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
