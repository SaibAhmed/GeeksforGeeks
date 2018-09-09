package com.saib;

import java.util.Arrays;

public class RearrangeArray {

    static void rearrangeArray( int arr[],int n){
        Arrays.sort(arr);
        int tempArr[]=new int[n];

        int arrayIndex =0;

        for (int i=0 , j=n-1 ; i<=n/2 || j>n/2 ; i++,j--){
            if (arrayIndex < n) {
                tempArr[arrayIndex] = arr[i];
                arrayIndex++;
            }

            if (arrayIndex < n){
                tempArr[arrayIndex]=arr[j];
                arrayIndex++;
            }

        }

        for (int i =0;i<n;i++){
            arr[i]=tempArr[i];
        }
    }

    public static void main(String[] args) {
        int arr[]= { 5, 8, 1, 4, 2, 9, 3, 7, 6 };
        int n = arr.length;
        rearrangeArray(arr,n);
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
