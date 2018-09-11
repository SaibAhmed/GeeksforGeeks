//Positive elements at even and negative at odd positions
package com.saib;

public class RearrangeArray_3 {
    static void arrayNegAndPos(int arr[],int n){
       int pos=0;
       int neg=1;
       int temp;

       while (true){
        while (pos < n && arr[pos]>=0){
            pos +=2;
        }
        while (neg < n && arr[neg] <= 0){
            neg +=2;
        }
        if (pos < n && neg < n){
            temp = arr[pos];
            arr[pos]=arr[neg];
            arr[neg]=temp;
        }
        else
            break;
       }
    }
    public static void main(String[] args) {
        int arr[]={1, -3, 5, 6, -3, 6, 7, -4, 9, 10};
        int n = arr.length;
        arrayNegAndPos(arr,n);
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
