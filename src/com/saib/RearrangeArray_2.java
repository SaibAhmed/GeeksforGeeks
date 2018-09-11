//Given an array of integers, segregate even and odd numbers in the array. All the even numbers should be present first, and then the odd numbers.
package com.saib;

public class RearrangeArray_2 {
    static void arrayEvenAndOdd(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[j] % 2 == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;

                }

            }
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 5, 3, 2, 6, 7, 11};
        int n = arr.length;
        arrayEvenAndOdd(arr, n);
    }
}
