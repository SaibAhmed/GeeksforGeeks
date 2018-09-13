//Program to find largest element in an array
package com.saib;

public class ArrayFind_1 {

    static int largest(int arr[], int n){

        int max =0;
        for (int i=0; i<n; i++ ){
            if (arr[i]>max){
                max = arr[i];
            }

        }



        return max;
    }


    public static void main(String[] args) {
        int arr[]={10, 324, 45, 90, 9808};
        int n = arr.length;
        System.out.println("largest element in array is : "+ largest(arr,n));
    }
}
